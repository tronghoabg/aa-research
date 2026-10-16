package androidx.room.coroutines;

import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import h.g.b.x;
import java.util.Arrays;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FlowUtil {
    public static final <R> k<R> createFlow(final RoomDatabase roomDatabase, final boolean z, String[] strArr, final l<? super SQLiteConnection, ? extends R> lVar) {
        x.f(roomDatabase, "db");
        x.f(strArr, "tableNames");
        x.f(lVar, "block");
        final k kVarU = ai.u(roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(strArr, strArr.length), true));
        return new k() { // from class: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1

            /* compiled from: WazeSource */
            /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2, reason: invalid class name */
            public final class AnonymousClass2<T> implements kotlinx.coroutines.b.l {
                final /* synthetic */ l $block$inlined;
                final /* synthetic */ RoomDatabase $db$inlined;
                final /* synthetic */ boolean $inTransaction$inlined;
                final /* synthetic */ kotlinx.coroutines.b.l $this_unsafeFlow;

                /* compiled from: WazeSource */
                /* renamed from: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1, reason: invalid class name */
                public final class AnonymousClass1 extends c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(e eVar) {
                        super(eVar);
                    }

                    @Override // h.c.b.a.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.b.l lVar, RoomDatabase roomDatabase, boolean z, l lVar2) {
                    this.$this_unsafeFlow = lVar;
                    this.$db$inlined = roomDatabase;
                    this.$inTransaction$inlined = z;
                    this.$block$inlined = lVar2;
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
                
                    if (r6.emit(r8, r0) == r1) goto L24;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.b.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, h.c.e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1 r0 = (androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1 r0 = new androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        h.c.a.a r1 = h.c.a.a.f48038a
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L3a
                        if (r2 == r4) goto L32
                        if (r2 != r3) goto L2a
                        e.b.c.b(r8)
                        goto L63
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        java.lang.Object r6 = r0.L$0
                        kotlinx.coroutines.b.l r6 = (kotlinx.coroutines.b.l) r6
                        e.b.c.b(r8)
                        goto L57
                    L3a:
                        e.b.c.b(r8)
                        kotlinx.coroutines.b.l r8 = r6.$this_unsafeFlow
                        r2 = r0
                        h.c.e r2 = (h.c.e) r2
                        java.util.Set r7 = (java.util.Set) r7
                        androidx.room.RoomDatabase r7 = r6.$db$inlined
                        boolean r2 = r6.$inTransaction$inlined
                        h.g.a.l r6 = r6.$block$inlined
                        r0.L$0 = r8
                        r0.label = r4
                        java.lang.Object r6 = androidx.room.util.DBUtil.performSuspending(r7, r4, r2, r6, r0)
                        if (r6 == r1) goto L66
                        r5 = r8
                        r8 = r6
                        r6 = r5
                    L57:
                        r7 = 0
                        r0.L$0 = r7
                        r0.label = r3
                        java.lang.Object r6 = r6.emit(r8, r0)
                        if (r6 != r1) goto L63
                        goto L66
                    L63:
                        h.ab r6 = h.ab.f48028a
                        return r6
                    L66:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, h.c.e):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.b.k
            public Object collect(kotlinx.coroutines.b.l lVar2, e eVar) {
                Object objCollect = kVarU.collect(new AnonymousClass2(lVar2, roomDatabase, z, lVar), eVar);
                return objCollect == a.f48038a ? objCollect : ab.f48028a;
            }
        };
    }
}
