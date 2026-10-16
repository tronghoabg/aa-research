package J9;

import A.e0;
import android.database.Cursor;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.List;
import uc.InterfaceC4266c;
import w9.InterfaceC4394m;
import yc.C4592o;
import z9.C4648p;

/* renamed from: J9.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0665y implements Le.d, SuccessContinuation, na.m, InterfaceC4394m, InterfaceC4266c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5992b;

    public /* synthetic */ C0665y(a2.k kVar, String str, int i5) {
        this.f5991a = i5;
        this.f5992b = str;
    }

    @Override // w9.InterfaceC4394m
    public Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor == null) {
            return null;
        }
        return new o9.e(this.f5992b, cursor.getInt(0), new s9.o(new s8.q(cursor.getLong(1), cursor.getInt(2))), cursor.getInt(3), cursor.getLong(4));
    }

    @Override // uc.InterfaceC4266c
    public void c(Object obj) {
        switch (this.f5991a) {
            case 6:
                if (!(obj instanceof List)) {
                    Fe.b.q(this.f5992b);
                    break;
                } else {
                    List list = (List) obj;
                    if (list.size() > 1) {
                        new C4592o((String) list.get(0), (String) list.get(1), list.get(2));
                        break;
                    }
                }
                break;
            case 7:
                if (!(obj instanceof List)) {
                    Fe.b.q(this.f5992b);
                    break;
                } else {
                    List list2 = (List) obj;
                    if (list2.size() > 1) {
                        new C4592o((String) list2.get(0), (String) list2.get(1), list2.get(2));
                        break;
                    }
                }
                break;
            default:
                if (!(obj instanceof List)) {
                    Fe.b.q(this.f5992b);
                    break;
                } else {
                    List list3 = (List) obj;
                    if (list3.size() > 1) {
                        new C4592o((String) list3.get(0), (String) list3.get(1), list3.get(2));
                        break;
                    }
                }
                break;
        }
    }

    @Override // na.m
    public Object d() {
        switch (this.f5991a) {
            case 3:
                throw new la.p(this.f5992b, 13);
            default:
                throw new la.p(this.f5992b, 13);
        }
    }

    @Override // Le.d
    public boolean test(Object obj) {
        sa.f fVar = (sa.f) obj;
        String str = this.f5992b;
        if (str.equals("ON_FOREGROUND") && fVar.e()) {
            return true;
        }
        for (C4648p c4648p : fVar.h()) {
            if (c4648p.c().toString().equals(str) || c4648p.b().getName().equals(str)) {
                ic.d.E("The event " + str + " is contained in the list of triggers");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        String str = this.f5992b;
        W9.A a5 = (W9.A) obj;
        switch (this.f5991a) {
            case 1:
                e0 e0Var = FirebaseMessaging.f27357l;
                a5.getClass();
                Task taskG = a5.g(new W9.x("S", str));
                a5.i();
                return taskG;
            default:
                e0 e0Var2 = FirebaseMessaging.f27357l;
                a5.getClass();
                Task taskG2 = a5.g(new W9.x("U", str));
                a5.i();
                return taskG2;
        }
    }

    public /* synthetic */ C0665y(String str, int i5) {
        this.f5991a = i5;
        this.f5992b = str;
    }
}
