package com.waze.cf.c;

import android.content.DialogInterface;
import com.waze.ab.p;
import h.g.b.am;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ am f22190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f22191b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f22192c;

    public /* synthetic */ c(am amVar, h.g.a.a aVar, int i2) {
        this.f22192c = i2;
        this.f22190a = amVar;
        this.f22191b = aVar;
    }

    @Override // com.waze.ab.p
    public final void a(DialogInterface dialogInterface, boolean z) {
        int i2 = this.f22192c;
        am amVar = this.f22190a;
        if (i2 != 0) {
            if (amVar.f48101a) {
                return;
            }
            h.g.a.a aVar = this.f22191b;
            amVar.f48101a = true;
            aVar.invoke();
            return;
        }
        if (amVar.f48101a) {
            return;
        }
        h.g.a.a aVar2 = this.f22191b;
        amVar.f48101a = true;
        aVar2.invoke();
    }
}
