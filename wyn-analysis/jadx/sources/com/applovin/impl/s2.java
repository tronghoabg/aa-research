package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s2 extends BaseAdapter implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    protected Context f22761a;

    /* renamed from: b, reason: collision with root package name */
    private List f22762b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Map f22763c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private a f22764d;

    public interface a {
        void a(j2 j2Var, r2 r2Var);
    }

    public s2(Context context) {
        this.f22761a = context.getApplicationContext();
    }

    public r2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    public abstract int b();

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 getItem(int i5) {
        return (r2) this.f22762b.get(i5);
    }

    public abstract List c(int i5);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new D0(this, 13));
    }

    public abstract int d(int i5);

    public abstract r2 e(int i5);

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f22762b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i5) {
        return getItem(i5).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        q2 q2Var;
        r2 item = getItem(i5);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            q2Var = new q2();
            q2Var.f22601a = (TextView) view.findViewById(R.id.text1);
            q2Var.f22602b = (TextView) view.findViewById(R.id.text2);
            q2Var.f22603c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            q2Var.f22604d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(q2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            q2Var = (q2) view.getTag();
        }
        q2Var.a(i5);
        q2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return r2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i5) {
        return getItem(i5).o();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i5;
        this.f22762b = new ArrayList();
        int iB = b();
        this.f22763c = new HashMap(iB);
        r2 r2VarA = a();
        if (r2VarA != null) {
            this.f22762b.add(r2VarA);
            i5 = 1;
        } else {
            i5 = 0;
        }
        for (int i10 = 0; i10 < iB; i10++) {
            int iD = d(i10);
            if (iD != 0) {
                this.f22762b.add(e(i10));
                this.f22762b.addAll(c(i10));
                this.f22763c.put(Integer.valueOf(i10), Integer.valueOf(i5));
                i5 = iD + 1 + i5;
            }
        }
        this.f22762b.add(new w4(""));
        super.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q2 q2Var = (q2) view.getTag();
        r2 r2VarB = q2Var.b();
        j2 j2VarA = a(q2Var.a());
        a aVar = this.f22764d;
        if (aVar == null || j2VarA == null) {
            return;
        }
        aVar.a(j2VarA, r2VarB);
    }

    public void a(a aVar) {
        this.f22764d = aVar;
    }

    private j2 a(int i5) {
        for (int i10 = 0; i10 < b(); i10++) {
            Integer num = (Integer) this.f22763c.get(Integer.valueOf(i10));
            if (num != null) {
                if (i5 <= num.intValue() + d(i10)) {
                    return new j2(i10, i5 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AbstractC1650m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f22761a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
