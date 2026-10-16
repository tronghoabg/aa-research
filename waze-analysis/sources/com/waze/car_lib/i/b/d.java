package com.waze.car_lib.i.b;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.core.content.ContextCompat;
import com.waze.navigate.NavigationInfoNativeManager;
import com.waze.navigate.dj;
import com.waze.navigate.gl;
import com.waze.navigate.gm;
import com.waze.navigate.gw;
import com.waze.reports_v2.c.an;
import com.waze.reports_v2.c.cs;
import com.waze.reports_v2.c.db;
import com.waze.reports_v2.presentation.ap;
import com.waze.reports_v2.presentation.aw;
import com.waze.search.v2.cu;
import com.waze.ui.m.as;
import com.waze.z.a.d.am;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19981b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19982c;

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f19982c = i2;
        this.f19981b = obj;
        this.f19980a = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, kotlinx.coroutines.b.bm] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v29, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v36, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        InputMethodManager inputMethodManager;
        switch (this.f19982c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ((NavigationInfoNativeManager) this.f19981b).removeNavigationUpdateListener((dj) this.f19980a);
                break;
            case 3:
                gw gwVar = gw.f31465a;
                ((gm) this.f19981b).a(gl.f31436c);
                break;
            case 4:
                an anVar = (an) this.f19980a;
                break;
            case 5:
                db.h((db) this.f19980a, (cs) this.f19981b);
                break;
            case 6:
                this.f19980a.a(com.waze.reports_v2.presentation.a.f34608a);
                ((com.waze.app_nav.hub.b.i) this.f19981b).b(false);
                break;
            case 7:
                this.f19980a.a(com.waze.reports_v2.presentation.a.f34609b);
                ((com.waze.app_nav.hub.b.i) this.f19981b).b(false);
                break;
            case 8:
                ap.r((ap) this.f19981b, (aw) this.f19980a);
                break;
            case 9:
                ((ap) this.f19981b).y((aw) this.f19980a);
                break;
            case 10:
                if (this.f19981b instanceof am) {
                    this.f19980a.invoke();
                }
                break;
            case 11:
                Object obj = this.f19981b;
                if (obj != null && (inputMethodManager = (InputMethodManager) ContextCompat.getSystemService((Context) obj, InputMethodManager.class)) != null) {
                    Object obj2 = this.f19980a;
                    View currentFocus = ((Activity) obj).getCurrentFocus();
                    if (currentFocus != null) {
                        obj2 = currentFocus;
                    }
                    inputMethodManager.hideSoftInputFromWindow(((View) obj2).getWindowToken(), 0);
                }
                break;
            case 12:
                int i2 = cu.f36302a;
                this.f19980a.invoke(((com.waze.search.v2.a) this.f19981b).b());
                break;
            case 13:
                int i3 = cu.f36302a;
                com.waze.speech.k kVarC = ((com.waze.search.v2.n) this.f19981b).c();
                if (kVarC != null) {
                    this.f19980a.invoke(kVarC);
                }
                break;
            default:
                int i4 = cu.f36302a;
                this.f19981b.invoke(new com.waze.search.v2.am(as.f42796a, this.f19980a));
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ d(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f19982c = i2;
        this.f19980a = obj;
        this.f19981b = obj2;
    }
}
