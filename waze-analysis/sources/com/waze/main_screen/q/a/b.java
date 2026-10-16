package com.waze.main_screen.q.a;

import com.waze.main.navigate.LocationData;
import com.waze.navigate.AddressItem;
import com.waze.navigate.DriveToNativeManager;
import com.waze.reports.ed;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final bn f27380a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f27381b;

    public b() {
        bn bnVarB = ck.b(new a(null, null, null, null, null));
        this.f27380a = bnVarB;
        this.f27381b = ai.U(bnVarB);
    }

    public final ch a() {
        return this.f27381b;
    }

    public final void b() {
        bn bnVar;
        Object objD;
        do {
            bnVar = this.f27380a;
            objD = bnVar.d();
        } while (!bnVar.f(objD, new a(null, null, null, null, null)));
    }

    public final void c(DriveToNativeManager.AddressItemAppData addressItemAppData) {
        while (true) {
            bn bnVar = this.f27380a;
            Object objD = bnVar.d();
            DriveToNativeManager.AddressItemAppData addressItemAppData2 = addressItemAppData;
            if (bnVar.f(objD, a.f((a) objD, null, null, null, addressItemAppData2, null, 23))) {
                return;
            } else {
                addressItemAppData = addressItemAppData2;
            }
        }
    }

    public final void d(AddressItem addressItem) {
        while (true) {
            bn bnVar = this.f27380a;
            Object objD = bnVar.d();
            AddressItem addressItem2 = addressItem;
            if (bnVar.f(objD, a.f((a) objD, null, null, null, null, addressItem2, 15))) {
                return;
            } else {
                addressItem = addressItem2;
            }
        }
    }

    public final void e(LocationData locationData) {
        while (true) {
            bn bnVar = this.f27380a;
            Object objD = bnVar.d();
            LocationData locationData2 = locationData;
            if (bnVar.f(objD, a.f((a) objD, locationData2, null, null, null, null, 30))) {
                return;
            } else {
                locationData = locationData2;
            }
        }
    }

    public final void f(String str) {
        while (true) {
            bn bnVar = this.f27380a;
            Object objD = bnVar.d();
            String str2 = str;
            if (bnVar.f(objD, a.f((a) objD, null, str2, null, null, null, 29))) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void g(ed edVar) {
        while (true) {
            bn bnVar = this.f27380a;
            Object objD = bnVar.d();
            ed edVar2 = edVar;
            if (bnVar.f(objD, a.f((a) objD, null, null, edVar2, null, null, 27))) {
                return;
            } else {
                edVar = edVar2;
            }
        }
    }
}
