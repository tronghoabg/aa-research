package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.applovin.impl.c2;

/* loaded from: classes.dex */
public class k extends View {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f21091a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21092b;

    public interface a {
        void a();

        void b();
    }

    public k(c2 c2Var, Context context) {
        super(context);
        this.f21091a = c2Var;
        setClickable(false);
        setFocusable(false);
    }

    public boolean a() {
        return this.f21092b;
    }

    public void b() {
        a(null);
    }

    public String getIdentifier() {
        return this.f21091a.b();
    }

    public void a(a aVar) {
        if (this.f21092b) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        Drawable drawableA = this.f21091a.a();
        if (drawableA == null) {
            if (aVar != null) {
                aVar.b();
            }
        } else {
            setBackground(drawableA);
            this.f21092b = true;
            if (aVar != null) {
                aVar.a();
            }
        }
    }
}
