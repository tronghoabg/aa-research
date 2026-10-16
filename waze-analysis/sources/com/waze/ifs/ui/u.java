package com.waze.ifs.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.res.ResourcesCompat;
import com.waze.R;
import com.waze.settings.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class u extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final LayoutInflater f24576a;

    /* renamed from: e, reason: collision with root package name */
    protected gw[] f24580e;

    /* renamed from: g, reason: collision with root package name */
    private Context f24582g;

    /* renamed from: b, reason: collision with root package name */
    private gw f24577b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f24578c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24579d = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24581f = false;

    public u(Context context) {
        this.f24582g = context;
        this.f24576a = LayoutInflater.from(context);
        this.f24582g = context;
    }

    public void b(gw[] gwVarArr) {
        this.f24580e = gwVarArr;
        notifyDataSetChanged();
    }

    public final int c() {
        return this.f24578c;
    }

    public final gw d() {
        return this.f24577b;
    }

    public final void e(boolean z) {
        this.f24581f = z;
    }

    public final void f(boolean z) {
        this.f24579d = z;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        gw[] gwVarArr = this.f24580e;
        if (gwVarArr == null) {
            return 0;
        }
        return this.f24579d ? gwVarArr.length : gwVarArr.length - 1;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        gw[] gwVarArr = this.f24580e;
        if (gwVarArr == null) {
            return null;
        }
        return gwVarArr[i2];
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        Drawable drawable;
        if (view == null) {
            view = this.f24576a.inflate(R.layout.omni_select_item, viewGroup, false);
        }
        gw[] gwVarArr = this.f24580e;
        gw gwVar = gwVarArr[i2];
        int length = gwVarArr.length - 1;
        TextView textView = (TextView) view.findViewById(R.id.omniSelectItemText);
        TextView textView2 = (TextView) view.findViewById(R.id.omniSelectItemSubText);
        ImageView imageView = (ImageView) view.findViewById(R.id.omniSelectItemIcon);
        if (imageView != null && gwVar != null) {
            Drawable drawable2 = gwVar.f37352e;
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
                imageView.setVisibility(0);
            } else if (gwVar.f37356i == 0 || (drawable = ResourcesCompat.getDrawable(this.f24582g.getResources(), gwVar.f37356i, null)) == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setImageDrawable(drawable);
            }
        }
        textView.setText(gwVar.f37350c);
        if (this.f24581f && i2 == length) {
            textView.setTypeface(null, 1);
        } else {
            textView.setTypeface(null, 0);
        }
        String str = gwVar.f37351d;
        if (str == null || str.length() == 0) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(str);
        }
        if (gwVar.f37348a) {
            this.f24577b = gwVar;
            this.f24578c = i2;
        }
        ((ImageView) view.findViewById(R.id.omniSelectItemCheck)).setVisibility(true != gwVar.f37348a ? 4 : 0);
        return view;
    }
}
