package androidx.compose.runtime;

import androidx.collection.IntList;
import androidx.collection.ObjectList;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.f;
import h.c.e;
import h.g.a.p;
import h.g.b.au;
import h.g.b.x;
import h.m.h;
import h.m.j;
import h.m.k;
import h.n.o;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class ComposePausableCompositionException extends RuntimeException {
    private final ObjectList<Object> instances;
    private final int lastOperation;
    private final IntList operations;
    private final ObjectList<Object> reused;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1, reason: invalid class name */
    final class AnonymousClass1 extends f implements p<j<? super String>, e<? super ab>, Object> {
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass1 anonymousClass1 = ComposePausableCompositionException.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h.g.a.p
        public final Object invoke(j<? super String> jVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(jVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            j jVar;
            int i2;
            int i3;
            int i4;
            String strConcat;
            int i5;
            int i6;
            String str;
            a aVar = a.f48038a;
            int i7 = this.label;
            if (i7 == 0) {
                c.b(obj);
                jVar = (j) this.L$0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.I$2;
                i3 = this.I$1;
                i4 = this.I$0;
                jVar = (j) this.L$0;
                c.b(obj);
            }
            while (i4 < Math.min(ComposePausableCompositionException.this.lastOperation + 10, ComposePausableCompositionException.this.operations._size)) {
                int i8 = i4 + 1;
                int i9 = ComposePausableCompositionException.this.operations.get(i4);
                switch (i9) {
                    case 0:
                        strConcat = "up";
                        break;
                    case 1:
                        int i10 = i3 + 1;
                        Object obj2 = ComposePausableCompositionException.this.instances.get(i3);
                        Objects.toString(obj2);
                        String strConcat2 = "down ".concat(String.valueOf(obj2));
                        i3 = i10;
                        strConcat = strConcat2;
                        break;
                    case 2:
                        strConcat = "remove " + ComposePausableCompositionException.this.operations.get(i8) + ' ' + ComposePausableCompositionException.this.operations.get(i4 + 2);
                        i8 = i4 + 3;
                        break;
                    case 3:
                        strConcat = "move " + ComposePausableCompositionException.this.operations.get(i8) + ' ' + ComposePausableCompositionException.this.operations.get(i4 + 2) + ' ' + ComposePausableCompositionException.this.operations.get(i4 + 3);
                        i8 = i4 + 4;
                        break;
                    case 4:
                        strConcat = "clear";
                        break;
                    case 5:
                        i5 = i4 + 2;
                        i6 = i3 + 1;
                        str = "insertBottomUp " + ComposePausableCompositionException.this.operations.get(i8) + ' ' + ComposePausableCompositionException.this.instances.get(i3);
                        i8 = i5;
                        strConcat = str;
                        i3 = i6;
                        break;
                    case 6:
                        i5 = i4 + 2;
                        i6 = i3 + 1;
                        str = "insertTopDown " + ComposePausableCompositionException.this.operations.get(i8) + ' ' + ComposePausableCompositionException.this.instances.get(i3);
                        i8 = i5;
                        strConcat = str;
                        i3 = i6;
                        break;
                    case 7:
                        Object obj3 = ComposePausableCompositionException.this.instances.get(i3);
                        x.d(obj3, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                        au.h(obj3, 2);
                        p pVar = (p) obj3;
                        i3 += 2;
                        Objects.toString(pVar);
                        strConcat = "apply ".concat(String.valueOf(pVar));
                        break;
                    case 8:
                        Object obj4 = ComposePausableCompositionException.this.reused.get(i2);
                        Objects.toString(obj4);
                        strConcat = "reuse ".concat(String.valueOf(obj4));
                        i2++;
                        break;
                    case 9:
                        strConcat = "recompose pending";
                        break;
                    default:
                        strConcat = "unknown op: " + i9;
                        break;
                }
                this.L$0 = jVar;
                this.I$0 = i8;
                this.I$1 = i3;
                this.I$2 = i2;
                this.label = 1;
                if (jVar.a(i4 + ": " + strConcat, this) == aVar) {
                    return aVar;
                }
                i4 = i8;
            }
            return ab.f48028a;
        }
    }

    public ComposePausableCompositionException(ObjectList<Object> objectList, ObjectList<Object> objectList2, IntList intList, int i2, Throwable th) {
        super(th);
        this.instances = objectList;
        this.reused = objectList2;
        this.operations = intList;
        this.lastOperation = i2;
    }

    private final h<String> operationsSequence() {
        return k.b(new AnonymousClass1(null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return o.al("\n            |Failed to execute op number " + this.lastOperation + ":\n            |" + i.aM(i.an(k.j(operationsSequence()), 50), "\n", null, null, 0, null, 62) + "\n            ");
    }

    public static /* synthetic */ void getMessage$annotations() {
    }
}
