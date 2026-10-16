package r9;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import w9.InterfaceC4388g;

/* loaded from: classes4.dex */
public final /* synthetic */ class H implements InterfaceC4388g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f44570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f44571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f44572d;

    public /* synthetic */ H(Object obj, Cloneable cloneable, Object obj2, int i5) {
        this.f44569a = i5;
        this.f44570b = obj;
        this.f44571c = cloneable;
        this.f44572d = obj2;
    }

    @Override // w9.InterfaceC4388g
    public final void accept(Object obj) {
        Object obj2 = this.f44572d;
        Cloneable cloneable = this.f44571c;
        Object obj3 = this.f44570b;
        Cursor cursor = (Cursor) obj;
        switch (this.f44569a) {
            case 0:
                R1.q qVar = (R1.q) obj3;
                qVar.getClass();
                int i5 = cursor.getInt(0);
                HashSet hashSet = (HashSet) cloneable;
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    hashSet.add(Integer.valueOf(i5));
                    ((ArrayList) obj2).add(qVar.o(i5, cursor.getBlob(1)));
                    break;
                }
                break;
            default:
                O o7 = (O) obj3;
                o7.getClass();
                int i10 = cursor.getInt(0);
                if (((SparseArray) cloneable).get(i10) == null) {
                    o7.j(i10);
                    o7.f44590a.f0("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i10));
                    o7.f44595f--;
                    int[] iArr = (int[]) obj2;
                    iArr[0] = iArr[0] + 1;
                    break;
                }
                break;
        }
    }
}
