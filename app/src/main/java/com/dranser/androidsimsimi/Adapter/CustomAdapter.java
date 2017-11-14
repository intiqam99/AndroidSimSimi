package com.dranser.androidsimsimi.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.dranser.androidsimsimi.Models.ChatModel;
import com.dranser.androidsimsimi.R;
import com.github.library.bubbleview.BubbleTextView;

import java.util.List;

/**
 * Created by Dranser on 13/11/2017.
 */

public class CustomAdapter extends BaseAdapter{

    private List<ChatModel> list_chat_models;
    private Context context;
    private LayoutInflater layoutInflater;

    public CustomAdapter(List<ChatModel> list_chat_models, Context context) {
        this.list_chat_models = list_chat_models;
        this.context = context;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list_chat_models.size();
    }

    @Override
    public Object getItem(int position) {
        return list_chat_models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null)
        {
            if(list_chat_models.get(position).isSend)
                view = layoutInflater.inflate(R.layout.list_item_mensaje_enviar,null);
            else
                view = layoutInflater.inflate(R.layout.list_item_mensaje_recibir,null);

            BubbleTextView texto_mensage = (BubbleTextView)view.findViewById(R.id.texto_mensaje);
            texto_mensage.setText(list_chat_models.get(position).mensaje);
        }
        return view;
    }
}
