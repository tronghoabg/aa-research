package r9;

import E5.n0;
import android.database.Cursor;
import com.google.protobuf.InvalidProtocolBufferException;
import java.util.HashMap;
import w9.C4386e;
import w9.InterfaceC4388g;

/* loaded from: classes4.dex */
public final /* synthetic */ class E implements InterfaceC4388g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f44554c;

    public /* synthetic */ E(int i5, Object obj, Object obj2) {
        this.f44552a = i5;
        this.f44553b = obj;
        this.f44554c = obj2;
    }

    @Override // w9.InterfaceC4388g
    public final void accept(Object obj) {
        switch (this.f44552a) {
            case 0:
                HashMap map = (HashMap) this.f44554c;
                Cursor cursor = (Cursor) obj;
                F f10 = (F) this.f44553b;
                f10.getClass();
                try {
                    int i5 = cursor.getInt(0);
                    String string = cursor.getString(1);
                    a2.v vVar = f10.f44556b;
                    ia.h hVarE = ia.h.e(cursor.getBlob(2));
                    vVar.getClass();
                    f10.i(new s9.a(i5, string, a2.v.q(hVarE), map.containsKey(Integer.valueOf(i5)) ? (s9.c) map.get(Integer.valueOf(i5)) : s9.a.f45354e));
                    return;
                } catch (InvalidProtocolBufferException e7) {
                    A6.c.s("Failed to decode index: " + e7, new Object[0]);
                    throw null;
                }
            default:
                n0 n0Var = (n0) this.f44553b;
                n0Var.getClass();
                ((C4386e) this.f44554c).a(new ng.a(23, n0Var, (v9.f) obj));
                return;
        }
    }
}
