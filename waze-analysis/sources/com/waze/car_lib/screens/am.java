package com.waze.car_lib.screens;

import android.support.v7.widget.RecyclerView;
import com.waze.navigate.AddressItem;
import i.b.l.fj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class am implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f21773a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21774b;

    public /* synthetic */ am(Object obj, int i2) {
        this.f21774b = i2;
        this.f21773a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v52, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f21774b) {
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
                this.f21773a.a((Boolean) obj);
                break;
            case 7:
                AddressItem addressItem = (AddressItem) obj;
                if (addressItem != null) {
                    addressItem.setStartTime(String.valueOf(((com.waze.planned_drive.histogram.f) this.f21773a).c() / 1000));
                }
                break;
            case 8:
                ((RecyclerView) this.f21773a).ao(((Integer) obj).intValue());
                break;
            case 9:
                i.b.j.l lVar = (i.b.j.l) obj;
                h.g.b.x.f(lVar, "$this$send");
                Object obj2 = this.f21773a;
                i.b.j.n nVarNewBuilder = i.b.j.o.newBuilder();
                nVarNewBuilder.a((String) obj2);
                lVar.a(nVarNewBuilder);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                fj defaultInstance = (fj) obj;
                if (defaultInstance == null) {
                    defaultInstance = fj.getDefaultInstance();
                    h.g.b.x.e(defaultInstance, "getDefaultInstance(...)");
                }
                this.f21773a.a(defaultInstance);
                break;
            case 18:
                fj defaultInstance2 = (fj) obj;
                if (defaultInstance2 == null) {
                    defaultInstance2 = fj.getDefaultInstance();
                    h.g.b.x.e(defaultInstance2, "getDefaultInstance(...)");
                }
                this.f21773a.a(defaultInstance2);
                break;
            case 19:
                com.waze.reports_v2.c.db dbVar = (com.waze.reports_v2.c.db) this.f21773a;
                dbVar.f34394g.a("TapReportingEducation display job complete");
                dbVar.f34395h.e(null);
                break;
            default:
                Integer num = (Integer) obj;
                ?? r4 = this.f21773a;
                if (num == null || num.intValue() < 0) {
                    r4.b(new RuntimeException("invalid azimuth"));
                } else {
                    r4.a(num);
                }
                break;
        }
        return h.ab.f48028a;
    }
}
