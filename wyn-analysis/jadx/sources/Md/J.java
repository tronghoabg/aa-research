package md;

import ad.C1355I;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.protobuf.InvalidProtocolBufferException;
import j$.util.DesugarCollections;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import ka.AbstractC3230e0;
import ka.G1;
import ne.C3618a;
import q.C3830p;
import r9.InterfaceC3945b;
import r9.RunnableC3954k;
import t0.C4058f;
import w9.AbstractC4392k;
import w9.ExecutorC4387f;
import w9.InterfaceC4388g;
import yc.InterfaceC4573C;
import yc.RunnableC4579b;

/* loaded from: classes5.dex */
public final class J implements InterfaceC3945b, b0.a {

    /* renamed from: a, reason: collision with root package name */
    public Object f40580a;

    /* renamed from: b, reason: collision with root package name */
    public Object f40581b;

    /* renamed from: c, reason: collision with root package name */
    public Object f40582c;

    public /* synthetic */ J(Object obj, Object obj2, Object obj3) {
        this.f40580a = obj;
        this.f40581b = obj2;
        this.f40582c = obj3;
    }

    public static void r(String str, Object... objArr) {
        String.format(Locale.US, str, objArr);
    }

    public static J s(Context context, AttributeSet attributeSet, int[] iArr, int i5, int i10) {
        return new J(context, context.obtainStyledAttributes(attributeSet, iArr, i5, i10));
    }

    @Override // r9.InterfaceC3945b
    public HashMap a(int i5, int i10, String str) {
        final HashMap map = new HashMap();
        final String[] strArr = new String[1];
        final String[] strArr2 = new String[1];
        final int[] iArr = new int[1];
        final ExecutorC4387f executorC4387f = new ExecutorC4387f();
        r9.K k = (r9.K) this.f40580a;
        C3618a c3618aG0 = k.g0("SELECT overlay_mutation, largest_batch_id, collection_path, document_id  FROM document_overlays WHERE uid = ? AND collection_group = ? AND largest_batch_id > ? ORDER BY largest_batch_id, collection_path, document_id LIMIT ?");
        c3618aG0.b((String) this.f40582c, str, Integer.valueOf(i5), Integer.valueOf(i10));
        c3618aG0.f(new InterfaceC4388g() { // from class: r9.B
            @Override // w9.InterfaceC4388g
            public final void accept(Object obj) {
                Cursor cursor = (Cursor) obj;
                md.J j8 = this.f44541a;
                j8.getClass();
                iArr[0] = cursor.getInt(1);
                strArr[0] = cursor.getString(2);
                strArr2[0] = cursor.getString(3);
                j8.t(executorC4387f, map, cursor);
            }
        });
        if (strArr[0] == null) {
            return map;
        }
        C3618a c3618aG02 = k.g0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_group = ? AND (collection_path > ? OR (collection_path = ? AND document_id > ?)) AND largest_batch_id = ?");
        String str2 = strArr[0];
        c3618aG02.b((String) this.f40582c, str, str2, str2, strArr2[0], Integer.valueOf(iArr[0]));
        Cursor cursorI = c3618aG02.i();
        while (cursorI.moveToNext()) {
            try {
                t(executorC4387f, map, cursorI);
            } finally {
            }
        }
        cursorI.close();
        executorC4387f.b();
        return map;
    }

    @Override // b0.a
    public L0.b b() {
        return (L0.b) this.f40580a;
    }

    @Override // b0.a
    public long c() {
        return Ba.c.R(((t0.y) this.f40582c).f44309c);
    }

    @Override // r9.InterfaceC3945b
    public HashMap d(TreeSet treeSet) {
        A6.c.z(treeSet.comparator() == null, "getOverlays() requires natural order", new Object[0]);
        HashMap map = new HashMap();
        ExecutorC4387f executorC4387f = new ExecutorC4387f();
        s9.m mVarD = s9.m.f45388b;
        ArrayList arrayList = new ArrayList();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            s9.h hVar = (s9.h) it.next();
            if (!mVarD.equals(hVar.d())) {
                u(map, executorC4387f, mVarD, arrayList);
                mVarD = hVar.d();
                arrayList.clear();
            }
            arrayList.add(hVar.f45375a.f());
        }
        u(map, executorC4387f, mVarD, arrayList);
        executorC4387f.b();
        return map;
    }

    @Override // r9.InterfaceC3945b
    public t9.d e(s9.h hVar) {
        String strN = AbstractC3230e0.n((s9.m) hVar.f45375a.k());
        String strF = hVar.f45375a.f();
        C3618a c3618aG0 = ((r9.K) this.f40580a).g0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id = ?");
        c3618aG0.b((String) this.f40582c, strN, strF);
        Cursor cursorI = c3618aG0.i();
        try {
            if (!cursorI.moveToFirst()) {
                cursorI.close();
                return null;
            }
            t9.d dVarK = k(cursorI.getInt(1), cursorI.getBlob(0));
            cursorI.close();
            return dVarK;
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

    @Override // r9.InterfaceC3945b
    public void f(int i5) {
        ((r9.K) this.f40580a).f0("DELETE FROM document_overlays WHERE uid = ? AND largest_batch_id = ?", (String) this.f40582c, Integer.valueOf(i5));
    }

    @Override // r9.InterfaceC3945b
    public void g(int i5, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            s9.h hVar = (s9.h) entry.getKey();
            t9.h hVar2 = (t9.h) entry.getValue();
            if (hVar2 == null) {
                Locale locale = Locale.US;
                throw new NullPointerException("null value for key: " + hVar);
            }
            s9.m mVar = hVar.f45375a;
            String strG = mVar.g(mVar.f45369a.size() - 2);
            s9.m mVar2 = hVar.f45375a;
            ((r9.K) this.f40580a).f0("INSERT OR REPLACE INTO document_overlays (uid, collection_group, collection_path, document_id, largest_batch_id, overlay_mutation) VALUES (?, ?, ?, ?, ?, ?)", (String) this.f40582c, strG, AbstractC3230e0.n((s9.m) mVar2.k()), mVar2.f(), Integer.valueOf(i5), ((v9.o) ((a2.v) this.f40581b).f17322b).i(hVar2).toByteArray());
        }
    }

    @Override // b0.a
    public L0.i getLayoutDirection() {
        return ((t0.y) ((C4058f) this.f40581b).f15788b).f45561e.f45525p;
    }

    @Override // r9.InterfaceC3945b
    public HashMap h(s9.m mVar, int i5) {
        HashMap map = new HashMap();
        ExecutorC4387f executorC4387f = new ExecutorC4387f();
        C3618a c3618aG0 = ((r9.K) this.f40580a).g0("SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND largest_batch_id > ?");
        c3618aG0.b((String) this.f40582c, AbstractC3230e0.n(mVar), Integer.valueOf(i5));
        Cursor cursorI = c3618aG0.i();
        while (cursorI.moveToNext()) {
            try {
                t(executorC4387f, map, cursorI);
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
        executorC4387f.b();
        return map;
    }

    public void i(N n10) {
        C3542j c3542j = O.f40592c;
        int length = 0;
        while (true) {
            Object[][] objArr = (Object[][]) this.f40582c;
            if (length >= objArr.length) {
                length = -1;
                break;
            } else if (c3542j.equals(objArr[length][0])) {
                break;
            } else {
                length++;
            }
        }
        if (length == -1) {
            Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, ((Object[][]) this.f40582c).length + 1, 2);
            Object[][] objArr3 = (Object[][]) this.f40582c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f40582c = objArr2;
            length = objArr2.length - 1;
        }
        ((Object[][]) this.f40582c)[length] = new Object[]{c3542j, n10};
    }

    public Dd.c j() {
        return new Dd.c((List) this.f40580a, (C3534b) this.f40581b, (Object[][]) this.f40582c);
    }

    public t9.d k(int i5, byte[] bArr) {
        try {
            return new t9.d(i5, ((v9.o) ((a2.v) this.f40581b).f17322b).c(G1.v(bArr)));
        } catch (InvalidProtocolBufferException e7) {
            A6.c.s("Overlay failed to parse: %s", e7);
            throw null;
        }
    }

    public void l(InterfaceC4573C interfaceC4573C, String str, String str2) {
        ((Handler) this.f40580a).post(new RunnableC3954k(interfaceC4573C, str, str2, 4));
    }

    public ColorStateList m(int i5) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = (TypedArray) this.f40581b;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0 || (colorStateList = Y0.e.getColorStateList((Context) this.f40580a, resourceId)) == null) ? typedArray.getColorStateList(i5) : colorStateList;
    }

    public Drawable n(int i5) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f40581b;
        return (!typedArray.hasValue(i5) || (resourceId = typedArray.getResourceId(i5, 0)) == 0) ? typedArray.getDrawable(i5) : Fe.g.B((Context) this.f40580a, resourceId);
    }

    public Drawable o(int i5) {
        int resourceId;
        Drawable drawableG;
        if (!((TypedArray) this.f40581b).hasValue(i5) || (resourceId = ((TypedArray) this.f40581b).getResourceId(i5, 0)) == 0) {
            return null;
        }
        C3830p c3830pA = C3830p.a();
        Context context = (Context) this.f40580a;
        synchronized (c3830pA) {
            drawableG = c3830pA.f43866a.g(context, resourceId, true);
        }
        return drawableG;
    }

    public Typeface p(int i5, int i10, q.O o7) {
        int resourceId = ((TypedArray) this.f40581b).getResourceId(i5, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f40582c) == null) {
            this.f40582c = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f40582c;
        ThreadLocal threadLocal = a1.l.f17132a;
        Context context = (Context) this.f40580a;
        if (context.isRestricted()) {
            return null;
        }
        return a1.l.b(context, resourceId, typedValue, i10, o7, true, false);
    }

    public File q(Context context) {
        ((ae.b) this.f40581b).getClass();
        return new File(context.getDir("lib", 0), System.mapLibraryName("flutter"));
    }

    public void t(ExecutorC4387f executorC4387f, Map map, Cursor cursor) {
        byte[] blob = cursor.getBlob(0);
        int i5 = cursor.getInt(1);
        Executor executor = executorC4387f;
        if (cursor.isLast()) {
            executor = AbstractC4392k.f47445b;
        }
        executor.execute(new Uc.e(i5, 2, this, blob, map));
    }

    public void u(HashMap map, ExecutorC4387f executorC4387f, s9.m mVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        R1.q qVar = new R1.q((r9.K) this.f40580a, "SELECT overlay_mutation, largest_batch_id FROM document_overlays WHERE uid = ? AND collection_path = ? AND document_id IN (", Arrays.asList((String) this.f40582c, AbstractC3230e0.n(mVar)), arrayList, ")");
        while (((Iterator) qVar.f10162f).hasNext()) {
            Cursor cursorI = qVar.w().i();
            while (cursorI.moveToNext()) {
                try {
                    t(executorC4387f, map, cursorI);
                } finally {
                }
            }
            cursorI.close();
        }
    }

    public void v() {
        ((TypedArray) this.f40581b).recycle();
    }

    public void w(String str) {
        ((Handler) this.f40580a).post(new RunnableC4579b(3, this, str));
    }

    public void x(List list) {
        Fe.e.p("addrs is empty", !list.isEmpty());
        this.f40580a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }

    public t9.h y(s9.h hVar, t9.m mVar) {
        t9.f fVar = (t9.f) this.f40582c;
        return fVar != null ? new t9.l(hVar, (s9.l) this.f40581b, fVar, mVar, (List) this.f40580a) : new t9.o(hVar, (s9.l) this.f40581b, mVar, (List) this.f40580a);
    }

    public J(int i5) {
        switch (i5) {
            case 8:
                this.f40580a = new ConcurrentLinkedQueue();
                break;
            default:
                ae.b bVar = new ae.b();
                C1355I c1355i = new C1355I(10);
                this.f40580a = new HashSet();
                this.f40581b = bVar;
                this.f40582c = c1355i;
                break;
        }
    }

    public J(Context context, TypedArray typedArray) {
        this.f40580a = context;
        this.f40581b = typedArray;
    }

    public J(s9.l lVar, t9.f fVar, List list) {
        this.f40581b = lVar;
        this.f40582c = fVar;
        this.f40580a = list;
    }
}
