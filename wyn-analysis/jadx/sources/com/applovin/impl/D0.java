package com.applovin.impl;

import android.content.Context;
import android.content.SharedPreferences;
import com.applovin.impl.m8;
import com.applovin.impl.q5;
import com.applovin.impl.w1;
import org.json.JSONException;

/* loaded from: classes.dex */
public final /* synthetic */ class D0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20762b;

    public /* synthetic */ D0(Object obj, int i5) {
        this.f20761a = i5;
        this.f20762b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f20761a) {
            case 0:
                ((m8.a) this.f20762b).b();
                break;
            case 1:
                ((q5.c) this.f20762b).a();
                break;
            case 2:
                ((w1.h) this.f20762b).a();
                break;
            case 3:
                ((C1623a) this.f20762b).b();
                break;
            case 4:
                ((SharedPreferences.Editor) this.f20762b).commit();
                break;
            case 5:
                ((d1) this.f20762b).notifyDataSetChanged();
                break;
            case 6:
                ((d6) this.f20762b).e();
                break;
            case 7:
                ((f5) this.f20762b).c();
                break;
            case 8:
                ((g6) this.f20762b).e();
                break;
            case 9:
                h1.b((Context) this.f20762b);
                break;
            case 10:
                ((m5) this.f20762b).i();
                break;
            case 11:
                ((m8) this.f20762b).a();
                break;
            case 12:
                ((o3) this.f20762b).notifyDataSetChanged();
                break;
            default:
                ((s2) this.f20762b).notifyDataSetChanged();
                break;
        }
    }
}
