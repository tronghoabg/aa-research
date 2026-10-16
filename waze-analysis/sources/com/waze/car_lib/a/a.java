package com.waze.car_lib.a;

import android.content.Context;
import android.content.Intent;
import com.waze.config.DebugConfigListActivity;
import com.waze.main_screen.p.bs;
import com.waze.main_screen.t.al;
import com.waze.main_screen.t.am;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f18805a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18806b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f18806b = i2;
        this.f18805a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v47, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v74, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v76, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f18806b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                ((bs) this.f18805a).z();
                break;
            case 9:
                ((com.waze.main_screen.p.a.b.a.t) this.f18805a).B();
                break;
            case 10:
                break;
            case 11:
                com.waze.z.a.b.ad adVarG = ((com.waze.main_screen.p.a.b.a.t) this.f18805a).e().g();
                break;
            case 12:
                com.waze.z.a.b.ad adVarI = ((com.waze.main_screen.p.a.b.a.t) this.f18805a).e().i();
                break;
            case 13:
                ((com.waze.main_screen.p.a.b.a.t) this.f18805a).B();
                break;
            case 14:
                int i2 = al.f27484a;
                ((am) this.f18805a).s().g();
                break;
            case 15:
                int i3 = al.f27484a;
                ((am) this.f18805a).s().j();
                break;
            case 16:
                int i4 = al.f27484a;
                ((am) this.f18805a).s().k();
                break;
            case 17:
                ?? r3 = this.f18805a;
                int i5 = al.f27484a;
                break;
            case 18:
                int i6 = al.f27484a;
                break;
            case 19:
                int i7 = al.f27484a;
                Context context = (Context) this.f18805a;
                context.startActivity(new Intent(context, (Class<?>) DebugConfigListActivity.class));
                break;
            default:
                int i8 = al.f27484a;
                ((com.waze.ao.b.f) this.f18805a).b();
                break;
        }
        return h.ab.f48028a;
    }
}
