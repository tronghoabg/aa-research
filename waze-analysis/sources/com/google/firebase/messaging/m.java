package com.google.firebase.messaging;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.waze.main.navigate.EventOnRoute;
import com.waze.sdk.bd;
import com.waze.search.v2.ck;
import com.waze.search.v2.fr;
import com.waze.view.navbar.EventsOnRouteView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10214b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f10215c;

    public /* synthetic */ m(Object obj, Object obj2, int i2) {
        this.f10215c = i2;
        this.f10213a = obj;
        this.f10214b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, kotlinx.coroutines.k] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10215c) {
            case 0:
                Object obj = this.f10214b;
                try {
                    ((com.google.android.gms.o.w) obj).c(((FirebaseMessaging) this.f10213a).h());
                    break;
                } catch (Exception e2) {
                    ((com.google.android.gms.o.w) obj).b(e2);
                    return;
                }
            case 1:
                bd.n((bd) this.f10213a, (android.support.v4.media.a.z) this.f10214b);
                break;
            case 2:
                bd.m((bd) this.f10213a, (com.waze.sdk.an) this.f10214b);
                break;
            case 3:
                bd.p((bd) this.f10214b, this.f10213a);
                break;
            case 4:
                bd.j((bd) this.f10213a, (com.waze.sdk.an) this.f10214b);
                break;
            case 5:
                ck.t((ck) this.f10214b, (fr) this.f10213a);
                break;
            case 6:
                ck.u((ck) this.f10214b, (fr) this.f10213a);
                break;
            case 7:
                ((com.waze.sharedui.views.p) this.f10213a).d((View) this.f10214b);
                break;
            case 8:
                ((com.waze.cg.a.c) this.f10213a).f22255b.o(((com.waze.uid.b.u) this.f10214b).n());
                break;
            case 9:
                android.support.v4.app.av activity = ((android.support.v4.app.ar) this.f10213a).getActivity();
                InputMethodManager inputMethodManager = (InputMethodManager) (activity != null ? activity.getSystemService("input_method") : null);
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput((View) this.f10214b, 1);
                    break;
                }
                break;
            case 10:
                com.waze.ui.x.u.k((Context) this.f10214b, (View) this.f10213a);
                break;
            case 11:
                ((EventsOnRouteView) this.f10214b).e((EventOnRoute[]) this.f10213a);
                break;
            default:
                this.f10214b.e((kotlinx.coroutines.ab) this.f10213a, h.ab.f48028a);
                break;
        }
    }

    public /* synthetic */ m(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f10215c = i2;
        this.f10214b = obj;
        this.f10213a = obj2;
    }
}
