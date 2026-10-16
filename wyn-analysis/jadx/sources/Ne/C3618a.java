package ne;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import h6.C2782a;
import h6.C2783b;
import h6.InterfaceC2787f;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import jb.c;
import kd.RunnableC3307c;
import mc.g;
import me.C3558a;
import q5.EnumC3870e;
import q6.d;
import r9.C3948e;
import r9.P;
import t5.C4114i;
import u6.AbstractC4256a;
import u6.v;
import uc.C4271h;
import uc.C4273j;
import uc.C4278o;
import uc.InterfaceC4267d;
import uc.InterfaceC4270g;
import uc.InterfaceC4272i;
import uc.InterfaceC4282s;
import w9.C4386e;
import w9.EnumC4385d;
import w9.InterfaceC4388g;
import w9.InterfaceC4394m;

/* renamed from: ne.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3618a implements InterfaceC2787f, P, InterfaceC4267d {

    /* renamed from: a, reason: collision with root package name */
    public Object f41020a;

    /* renamed from: b, reason: collision with root package name */
    public Object f41021b;

    /* renamed from: c, reason: collision with root package name */
    public Object f41022c;

    public /* synthetic */ C3618a(Object obj, Object obj2, Object obj3) {
        this.f41020a = obj;
        this.f41021b = obj2;
        this.f41022c = obj3;
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        long[] jArr = (long[]) this.f41022c;
        int iB = v.b(jArr, j8, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void b(Object... objArr) {
        this.f41022c = new c(objArr, 2);
    }

    public C4114i c() {
        String strConcat = ((String) this.f41020a) == null ? " backendName" : "";
        if (((EnumC3870e) this.f41022c) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C4114i((String) this.f41020a, (byte[]) this.f41021b, (EnumC3870e) this.f41022c);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // uc.InterfaceC4267d
    public void d(ByteBuffer byteBuffer, g gVar) {
        C4273j c4273j = (C4273j) this.f41022c;
        C4278o c4278oA = c4273j.f46754c.a(byteBuffer);
        String str = c4278oA.f46759a;
        boolean zEquals = str.equals("listen");
        AtomicReference atomicReference = (AtomicReference) this.f41021b;
        String str2 = c4273j.f46753b;
        InterfaceC4282s interfaceC4282s = c4273j.f46754c;
        InterfaceC4272i interfaceC4272i = (InterfaceC4272i) this.f41020a;
        Object obj = c4278oA.f46760b;
        if (!zEquals) {
            if (!str.equals("cancel")) {
                gVar.a(null);
                return;
            }
            if (((InterfaceC4270g) atomicReference.getAndSet(null)) == null) {
                gVar.a(interfaceC4282s.f("error", "No active stream to cancel", null));
                return;
            }
            try {
                interfaceC4272i.onCancel(obj);
                gVar.a(interfaceC4282s.b(null));
                return;
            } catch (RuntimeException e7) {
                Log.e("EventChannel#" + str2, "Failed to close event stream", e7);
                gVar.a(interfaceC4282s.f("error", e7.getMessage(), null));
                return;
            }
        }
        C4271h c4271h = new C4271h(this);
        if (((InterfaceC4270g) atomicReference.getAndSet(c4271h)) != null) {
            try {
                interfaceC4272i.onCancel(null);
            } catch (RuntimeException e10) {
                Log.e("EventChannel#" + str2, "Failed to close existing event stream", e10);
            }
        }
        try {
            interfaceC4272i.onListen(obj, c4271h);
            gVar.a(interfaceC4282s.b(null));
        } catch (RuntimeException e11) {
            atomicReference.set(null);
            Log.e("EventChannel#" + str2, "Failed to open event stream", e11);
            gVar.a(interfaceC4282s.f("error", e11.getMessage(), null));
        }
    }

    public Object e(InterfaceC4394m interfaceC4394m) {
        Cursor cursorI = i();
        try {
            if (!cursorI.moveToFirst()) {
                cursorI.close();
                return null;
            }
            Object objApply = interfaceC4394m.apply(cursorI);
            cursorI.close();
            return objApply;
        } catch (Throwable th) {
            if (cursorI != null) {
                try {
                    cursorI.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public int f(InterfaceC4388g interfaceC4388g) {
        Cursor cursorI = i();
        int i5 = 0;
        while (cursorI.moveToNext()) {
            try {
                i5++;
                interfaceC4388g.accept(cursorI);
            } catch (Throwable th) {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        cursorI.close();
        return i5;
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i5 = 0;
        while (true) {
            List list = (List) this.f41020a;
            if (i5 >= list.size()) {
                break;
            }
            int i10 = i5 * 2;
            long[] jArr = (long[]) this.f41021b;
            if (jArr[i10] <= j8 && j8 < jArr[i10 + 1]) {
                q6.c cVar = (q6.c) list.get(i5);
                C2783b c2783b = cVar.f44149a;
                if (c2783b.f36172e == -3.4028235E38f) {
                    arrayList2.add(cVar);
                } else {
                    arrayList.add(c2783b);
                }
            }
            i5++;
        }
        Collections.sort(arrayList2, new d(1));
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            C2782a c2782aA = ((q6.c) arrayList2.get(i11)).f44149a.a();
            c2782aA.f36154e = (-1) - i11;
            c2782aA.f36155f = 1;
            arrayList.add(c2782aA.a());
        }
        return arrayList;
    }

    public void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f41020a = str;
    }

    public Cursor i() {
        c cVar = (c) this.f41022c;
        String str = (String) this.f41021b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.f41020a;
        return cVar != null ? sQLiteDatabase.rawQueryWithFactory(cVar, str, null, null) : sQLiteDatabase.rawQuery(str, null);
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        AbstractC4256a.e(i5 >= 0);
        long[] jArr = (long[]) this.f41022c;
        AbstractC4256a.e(i5 < jArr.length);
        return jArr[i5];
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return ((long[]) this.f41022c).length;
    }

    @Override // r9.P
    public void start() {
        long j8 = C3948e.f44610f;
        this.f41020a = ((C4386e) this.f41021b).b(EnumC4385d.f47426j, j8, new RunnableC3307c(this, 8));
    }

    @Override // r9.P
    public void stop() {
        C3558a c3558a = (C3558a) this.f41020a;
        if (c3558a != null) {
            c3558a.n();
        }
    }
}
