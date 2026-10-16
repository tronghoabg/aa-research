package R1;

import Ef.H0;
import Hf.v0;
import K8.C0694f;
import Q1.x;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteStatement;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import cb.AbstractC1593a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.moloco.sdk.internal.MolocoLogger;
import i.AbstractC2820a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import ka.AbstractC3230e0;
import kd.RunnableC3307c;
import m9.F;
import m9.G;
import ne.C3618a;
import q.AbstractC3827n0;
import q.C3830p;
import r9.H;
import r9.InterfaceC3949f;
import r9.K;
import r9.v;
import w9.AbstractC4397p;
import w9.C4393l;

/* loaded from: classes.dex */
public final class q implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g, v {

    /* renamed from: a, reason: collision with root package name */
    public int f10157a;

    /* renamed from: b, reason: collision with root package name */
    public Object f10158b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10159c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10160d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10161e;

    /* renamed from: f, reason: collision with root package name */
    public Object f10162f;

    public q(View view) {
        this.f10157a = -1;
        this.f10158b = view;
        this.f10159c = C3830p.a();
    }

    public void A() {
        ((K) this.f10158b).f0("INSERT OR REPLACE INTO mutation_queues (uid, last_acknowledged_batch_id, last_stream_token) VALUES (?, ?, ?)", (String) this.f10161e, -1, ((ByteString) this.f10162f).toByteArray());
    }

    @Override // r9.v
    public void a() {
        K k = (K) this.f10158b;
        C3618a c3618aG0 = k.g0("SELECT batch_id FROM mutations WHERE uid = ? LIMIT 1");
        String str = (String) this.f10161e;
        c3618aG0.b(str);
        Cursor cursorI = c3618aG0.i();
        try {
            boolean zMoveToFirst = cursorI.moveToFirst();
            cursorI.close();
            if (zMoveToFirst) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            C3618a c3618aG02 = k.g0("SELECT path FROM document_mutations WHERE uid = ?");
            c3618aG02.b(str);
            cursorI = c3618aG02.i();
            while (cursorI.moveToNext()) {
                try {
                    arrayList.add(AbstractC3230e0.l(cursorI.getString(0)));
                } finally {
                }
            }
            cursorI.close();
            A6.c.z(arrayList.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty. Dangling keys: %s", arrayList);
        } finally {
        }
    }

    @Override // r9.v
    public t9.i b(int i5) {
        C3618a c3618aG0 = ((K) this.f10158b).g0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id >= ? ORDER BY batch_id ASC LIMIT 1");
        c3618aG0.b(1000000, (String) this.f10161e, Integer.valueOf(i5 + 1));
        Cursor cursorI = c3618aG0.i();
        try {
            if (!cursorI.moveToFirst()) {
                cursorI.close();
                return null;
            }
            t9.i iVarO = o(cursorI.getInt(0), cursorI.getBlob(1));
            cursorI.close();
            return iVarO;
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

    @Override // r9.v
    public t9.i c(int i5) {
        C3618a c3618aG0 = ((K) this.f10158b).g0("SELECT SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
        c3618aG0.b(1000000, (String) this.f10161e, Integer.valueOf(i5));
        Cursor cursorI = c3618aG0.i();
        try {
            if (!cursorI.moveToFirst()) {
                cursorI.close();
                return null;
            }
            t9.i iVarO = o(i5, cursorI.getBlob(0));
            cursorI.close();
            return iVarO;
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

    @Override // r9.v
    public ByteString d() {
        return (ByteString) this.f10162f;
    }

    @Override // r9.v
    public void e(t9.i iVar) throws SQLException {
        K k = (K) this.f10158b;
        SQLiteStatement sQLiteStatementCompileStatement = k.f44582l.compileStatement("DELETE FROM mutations WHERE uid = ? AND batch_id = ?");
        SQLiteStatement sQLiteStatementCompileStatement2 = k.f44582l.compileStatement("DELETE FROM document_mutations WHERE uid = ? AND path = ? AND batch_id = ?");
        int i5 = iVar.f45954a;
        Integer numValueOf = Integer.valueOf(i5);
        String str = (String) this.f10161e;
        sQLiteStatementCompileStatement.clearBindings();
        K.c0(sQLiteStatementCompileStatement, new Object[]{str, numValueOf});
        A6.c.z(sQLiteStatementCompileStatement.executeUpdateDelete() != 0, "Mutation batch (%s, %d) did not exist", str, Integer.valueOf(iVar.f45954a));
        Iterator it = iVar.f45957d.iterator();
        while (it.hasNext()) {
            s9.h hVar = ((t9.h) it.next()).f45951a;
            Object[] objArr = {str, AbstractC3230e0.n(hVar.f45375a), Integer.valueOf(i5)};
            sQLiteStatementCompileStatement2.clearBindings();
            K.c0(sQLiteStatementCompileStatement2, objArr);
            sQLiteStatementCompileStatement2.executeUpdateDelete();
            k.f44581j.m(hVar);
        }
    }

    @Override // r9.v
    public void f(ByteString byteString) {
        byteString.getClass();
        this.f10162f = byteString;
        A();
    }

    @Override // r9.v
    public ArrayList g(Set set) {
        int i5 = 0;
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC3230e0.n(((s9.h) it.next()).f45375a));
        }
        q qVar = new q((K) this.f10158b, "SELECT DISTINCT dm.batch_id, SUBSTR(m.mutations, 1, ?) FROM document_mutations dm, mutations m WHERE dm.uid = ? AND dm.path IN (", Arrays.asList(1000000, (String) this.f10161e), arrayList, ") AND dm.uid = m.uid AND dm.batch_id = m.batch_id ORDER BY dm.batch_id");
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        while (((Iterator) qVar.f10162f).hasNext()) {
            qVar.w().f(new H(this, hashSet, arrayList2, i5));
        }
        if (qVar.f10157a > 1) {
            Collections.sort(arrayList2, new q6.d(14));
        }
        return arrayList2;
    }

    @Override // r9.v
    public t9.i h(s8.q qVar, ArrayList arrayList, List list) throws SQLException {
        int i5 = this.f10157a;
        this.f10157a = i5 + 1;
        t9.i iVar = new t9.i(i5, qVar, arrayList, list);
        a2.v vVar = (a2.v) this.f10159c;
        vVar.getClass();
        u9.o oVarL = u9.p.l();
        oVarL.c(iVar.f45954a);
        v9.o oVar = (v9.o) vVar.f17322b;
        oVarL.d(v9.o.l(iVar.f45955b));
        Iterator it = iVar.f45956c.iterator();
        while (it.hasNext()) {
            oVarL.a(oVar.i((t9.h) it.next()));
        }
        Iterator it2 = iVar.f45957d.iterator();
        while (it2.hasNext()) {
            oVarL.b(oVar.i((t9.h) it2.next()));
        }
        u9.p pVar = (u9.p) oVarL.build();
        Integer numValueOf = Integer.valueOf(i5);
        byte[] byteArray = pVar.toByteArray();
        String str = (String) this.f10161e;
        Object[] objArr = {str, numValueOf, byteArray};
        K k = (K) this.f10158b;
        k.f0("INSERT INTO mutations (uid, batch_id, mutations) VALUES (?, ?, ?)", objArr);
        HashSet hashSet = new HashSet();
        SQLiteStatement sQLiteStatementCompileStatement = k.f44582l.compileStatement("INSERT INTO document_mutations (uid, path, batch_id) VALUES (?, ?, ?)");
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            s9.h hVar = ((t9.h) it3.next()).f45951a;
            if (hashSet.add(hVar)) {
                Object[] objArr2 = {str, AbstractC3230e0.n(hVar.f45375a), Integer.valueOf(i5)};
                sQLiteStatementCompileStatement.clearBindings();
                K.c0(sQLiteStatementCompileStatement, objArr2);
                sQLiteStatementCompileStatement.executeUpdateDelete();
                ((InterfaceC3949f) this.f10160d).u(hVar.d());
            }
        }
        return iVar;
    }

    @Override // r9.v
    public int i() {
        Integer numValueOf;
        C3618a c3618aG0 = ((K) this.f10158b).g0("SELECT IFNULL(MAX(batch_id), ?) FROM mutations WHERE uid = ?");
        c3618aG0.b(-1, (String) this.f10161e);
        Cursor cursorI = c3618aG0.i();
        try {
            if (cursorI.moveToFirst()) {
                numValueOf = Integer.valueOf(cursorI.getInt(0));
                cursorI.close();
            } else {
                cursorI.close();
                numValueOf = null;
            }
            return numValueOf.intValue();
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

    @Override // r9.v
    public void j(t9.i iVar, ByteString byteString) {
        byteString.getClass();
        this.f10162f = byteString;
        A();
    }

    @Override // r9.v
    public List k() {
        ArrayList arrayList = new ArrayList();
        C3618a c3618aG0 = ((K) this.f10158b).g0("SELECT batch_id, SUBSTR(mutations, 1, ?) FROM mutations WHERE uid = ? ORDER BY batch_id ASC");
        c3618aG0.b(1000000, (String) this.f10161e);
        Cursor cursorI = c3618aG0.i();
        while (cursorI.moveToNext()) {
            try {
                arrayList.add(o(cursorI.getInt(0), cursorI.getBlob(1)));
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
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.g
    public v0 l() {
        throw null;
    }

    public void l(long j8) {
        H0 h02 = (H0) this.f10161e;
        if (h02 == null || h02.isCancelled() || h02.I()) {
            this.f10157a = (int) j8;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "LinearGoNextActionImpl", AbstractC1593a.h(j8, "Start timer for duration: ", " seconds"), null, false, 12, null);
            this.f10161e = Ef.H.D((Kd.a) this.f10159c, null, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.k(this, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r8 < r0.f10156b) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(long r8, Q1.o r10) {
        /*
            r7 = this;
            int r0 = r7.f10157a
            if (r0 == 0) goto La1
            java.lang.Object r1 = r7.f10161e
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -1
            if (r0 == r2) goto L23
            int r0 = r1.size()
            int r3 = r7.f10157a
            if (r0 < r3) goto L23
            java.lang.Object r0 = r1.peek()
            R1.o r0 = (R1.o) r0
            int r3 = Q1.x.f9724a
            long r3 = r0.f10156b
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L23
            goto La1
        L23:
            java.lang.Object r0 = r7.f10159c
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L33
            Q1.o r0 = new Q1.o
            r0.<init>()
            goto L39
        L33:
            java.lang.Object r0 = r0.pop()
            Q1.o r0 = (Q1.o) r0
        L39:
            int r3 = r10.a()
            r0.D(r3)
            byte[] r3 = r10.f9702a
            int r10 = r10.f9703b
            byte[] r4 = r0.f9702a
            int r5 = r0.a()
            r6 = 0
            java.lang.System.arraycopy(r3, r10, r4, r6, r5)
            java.lang.Object r10 = r7.f10162f
            R1.o r10 = (R1.o) r10
            if (r10 == 0) goto L60
            long r3 = r10.f10156b
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L60
            java.util.ArrayList r8 = r10.f10155a
            r8.add(r0)
            return
        L60:
            java.lang.Object r10 = r7.f10160d
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L70
            R1.o r10 = new R1.o
            r10.<init>()
            goto L76
        L70:
            java.lang.Object r10 = r10.pop()
            R1.o r10 = (R1.o) r10
        L76:
            r10.getClass()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L83
            r6 = 1
        L83:
            Q1.k.c(r6)
            java.util.ArrayList r3 = r10.f10155a
            boolean r4 = r3.isEmpty()
            Q1.k.g(r4)
            r10.f10156b = r8
            r3.add(r0)
            r1.add(r10)
            r7.f10162f = r10
            int r8 = r7.f10157a
            if (r8 == r2) goto La0
            r7.p(r8)
        La0:
            return
        La1:
            java.lang.Object r0 = r7.f10158b
            R1.p r0 = (R1.p) r0
            r0.b(r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.q.m(long, Q1.o):void");
    }

    public void n() {
        View view = (View) this.f10158b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C0694f) this.f10160d) != null) {
                if (((C0694f) this.f10162f) == null) {
                    this.f10162f = new C0694f();
                }
                C0694f c0694f = (C0694f) this.f10162f;
                c0694f.f6641c = null;
                c0694f.f6640b = false;
                c0694f.f6642d = null;
                c0694f.f6639a = false;
                WeakHashMap weakHashMap = S.f38779a;
                ColorStateList colorStateListC = J.c(view);
                if (colorStateListC != null) {
                    c0694f.f6640b = true;
                    c0694f.f6641c = colorStateListC;
                }
                PorterDuff.Mode modeD = J.d(view);
                if (modeD != null) {
                    c0694f.f6639a = true;
                    c0694f.f6642d = modeD;
                }
                if (c0694f.f6640b || c0694f.f6639a) {
                    C3830p.e(background, c0694f, view.getDrawableState());
                    return;
                }
            }
            C0694f c0694f2 = (C0694f) this.f10161e;
            if (c0694f2 != null) {
                C3830p.e(background, c0694f2, view.getDrawableState());
                return;
            }
            C0694f c0694f3 = (C0694f) this.f10160d;
            if (c0694f3 != null) {
                C3830p.e(background, c0694f3, view.getDrawableState());
            }
        }
    }

    public t9.i o(int i5, byte[] bArr) {
        try {
            int length = bArr.length;
            a2.v vVar = (a2.v) this.f10159c;
            if (length < 1000000) {
                return vVar.t(u9.p.n(bArr));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(ByteString.copyFrom(bArr));
            boolean z2 = true;
            while (z2) {
                int size = (arrayList.size() * 1000000) + 1;
                C3618a c3618aG0 = ((K) this.f10158b).g0("SELECT SUBSTR(mutations, ?, ?) FROM mutations WHERE uid = ? AND batch_id = ?");
                c3618aG0.b(Integer.valueOf(size), 1000000, (String) this.f10161e, Integer.valueOf(i5));
                Cursor cursorI = c3618aG0.i();
                try {
                    if (cursorI.moveToFirst()) {
                        byte[] blob = cursorI.getBlob(0);
                        arrayList.add(ByteString.copyFrom(blob));
                        if (blob.length < 1000000) {
                            z2 = false;
                        }
                    }
                    cursorI.close();
                } finally {
                }
            }
            return vVar.t(u9.p.m(ByteString.copyFrom(arrayList)));
        } catch (InvalidProtocolBufferException e7) {
            A6.c.s("MutationBatch failed to parse: %s", e7);
            throw null;
        }
    }

    public void p(int i5) {
        ArrayList arrayList;
        while (true) {
            PriorityQueue priorityQueue = (PriorityQueue) this.f10161e;
            if (priorityQueue.size() <= i5) {
                return;
            }
            o oVar = (o) priorityQueue.poll();
            int i10 = x.f9724a;
            int i11 = 0;
            while (true) {
                int size = oVar.f10155a.size();
                arrayList = oVar.f10155a;
                if (i11 >= size) {
                    break;
                }
                ((p) this.f10158b).b(oVar.f10156b, (Q1.o) arrayList.get(i11));
                ((ArrayDeque) this.f10159c).push((Q1.o) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            o oVar2 = (o) this.f10162f;
            if (oVar2 != null && oVar2.f10156b == oVar.f10156b) {
                this.f10162f = null;
            }
            ((ArrayDeque) this.f10160d).push(oVar);
        }
    }

    public ColorStateList q() {
        C0694f c0694f = (C0694f) this.f10161e;
        if (c0694f != null) {
            return (ColorStateList) c0694f.f6641c;
        }
        return null;
    }

    public PorterDuff.Mode r() {
        C0694f c0694f = (C0694f) this.f10161e;
        if (c0694f != null) {
            return (PorterDuff.Mode) c0694f.f6642d;
        }
        return null;
    }

    public void s(Task task) {
        F f10;
        if (this.f10157a > 0) {
            Exception exception = task.getException();
            if ((exception instanceof G) && ((f10 = ((G) exception).f40425a) == F.ABORTED || f10 == F.ALREADY_EXISTS || f10 == F.FAILED_PRECONDITION || !v9.g.a(f10))) {
                this.f10157a--;
                ((C4393l) this.f10161e).a(new RunnableC3307c(this, 6));
                return;
            }
        }
        ((TaskCompletionSource) this.f10162f).setException(task.getException());
    }

    @Override // r9.v
    public void start() {
        ArrayList arrayList = new ArrayList();
        K k = (K) this.f10158b;
        Cursor cursorI = k.g0("SELECT uid FROM mutation_queues").i();
        while (cursorI.moveToNext()) {
            try {
                arrayList.add(cursorI.getString(0));
            } finally {
                if (cursorI != null) {
                    try {
                        cursorI.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        cursorI.close();
        this.f10157a = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C3618a c3618aG0 = k.g0("SELECT MAX(batch_id) FROM mutations WHERE uid = ?");
            c3618aG0.b(str);
            cursorI = c3618aG0.i();
            while (cursorI.moveToNext()) {
                try {
                    this.f10157a = Math.max(this.f10157a, cursorI.getInt(0));
                } finally {
                }
            }
            cursorI.close();
        }
        this.f10157a++;
        C3618a c3618aG02 = k.g0("SELECT last_stream_token FROM mutation_queues WHERE uid = ?");
        c3618aG02.b((String) this.f10161e);
        Cursor cursorI2 = c3618aG02.i();
        try {
            if (cursorI2.moveToFirst()) {
                this.f10162f = ByteString.copyFrom(cursorI2.getBlob(0));
                cursorI2.close();
            } else {
                cursorI2.close();
                A();
            }
        } finally {
        }
    }

    public void t(AttributeSet attributeSet, int i5) {
        ColorStateList colorStateListI;
        View view = (View) this.f10158b;
        Context context = view.getContext();
        int[] iArr = AbstractC2820a.f36436A;
        md.J jS = md.J.s(context, attributeSet, iArr, i5, 0);
        TypedArray typedArray = (TypedArray) jS.f40581b;
        View view2 = (View) this.f10158b;
        S.l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) jS.f40581b, i5);
        try {
            if (typedArray.hasValue(0)) {
                this.f10157a = typedArray.getResourceId(0, -1);
                C3830p c3830p = (C3830p) this.f10159c;
                Context context2 = view.getContext();
                int i10 = this.f10157a;
                synchronized (c3830p) {
                    colorStateListI = c3830p.f43866a.i(context2, i10);
                }
                if (colorStateListI != null) {
                    x(colorStateListI);
                }
            }
            if (typedArray.hasValue(1)) {
                J.i(view, jS.m(1));
            }
            if (typedArray.hasValue(2)) {
                J.j(view, AbstractC3827n0.c(typedArray.getInt(2, -1), null));
            }
            jS.v();
        } catch (Throwable th) {
            jS.v();
            throw th;
        }
    }

    public void u() {
        this.f10157a = -1;
        x(null);
        n();
    }

    public void v(int i5) {
        ColorStateList colorStateListI;
        this.f10157a = i5;
        C3830p c3830p = (C3830p) this.f10159c;
        if (c3830p != null) {
            Context context = ((View) this.f10158b).getContext();
            synchronized (c3830p) {
                colorStateListI = c3830p.f43866a.i(context, i5);
            }
        } else {
            colorStateListI = null;
        }
        x(colorStateListI);
        n();
    }

    public C3618a w() {
        this.f10157a++;
        List list = (List) this.f10161e;
        ArrayList arrayList = new ArrayList(list);
        int i5 = 0;
        while (true) {
            Iterator it = (Iterator) this.f10162f;
            if (!it.hasNext() || i5 >= 900 - list.size()) {
                break;
            }
            arrayList.add(it.next());
            i5++;
        }
        Object[] array = arrayList.toArray();
        C3618a c3618aG0 = ((K) this.f10158b).g0(((String) this.f10159c) + ((Object) AbstractC4397p.h(array.length, "?", ", ")) + ((String) this.f10160d));
        c3618aG0.b(array);
        return c3618aG0;
    }

    public void x(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C0694f) this.f10160d) == null) {
                this.f10160d = new C0694f();
            }
            C0694f c0694f = (C0694f) this.f10160d;
            c0694f.f6641c = colorStateList;
            c0694f.f6640b = true;
        } else {
            this.f10160d = null;
        }
        n();
    }

    public void y(ColorStateList colorStateList) {
        if (((C0694f) this.f10161e) == null) {
            this.f10161e = new C0694f();
        }
        C0694f c0694f = (C0694f) this.f10161e;
        c0694f.f6641c = colorStateList;
        c0694f.f6640b = true;
        n();
    }

    public void z(PorterDuff.Mode mode) {
        if (((C0694f) this.f10161e) == null) {
            this.f10161e = new C0694f();
        }
        C0694f c0694f = (C0694f) this.f10161e;
        c0694f.f6642d = mode;
        c0694f.f6639a = true;
        n();
    }

    public q(p pVar) {
        this.f10158b = pVar;
        this.f10159c = new ArrayDeque();
        this.f10160d = new ArrayDeque();
        this.f10161e = new PriorityQueue();
        this.f10157a = -1;
    }

    public q(K k, String str, List list, ArrayList arrayList, String str2) {
        this.f10157a = 0;
        this.f10158b = k;
        this.f10159c = str;
        this.f10161e = list;
        this.f10160d = str2;
        this.f10162f = arrayList.iterator();
    }
}
