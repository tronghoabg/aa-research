package androidx.datastore.core;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.a.q;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class StorageConnectionKt {

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.StorageConnectionKt$writeData$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes3.dex */
    final class C04302 extends g implements p<WriteScope, e<? super ab>, Object> {
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C04302(Object obj, e<? super C04302> eVar) {
            super(2, eVar);
            this.$value = obj;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            C04302 c04302 = new C04302(this.$value, eVar);
            c04302.L$0 = obj;
            return c04302;
        }

        @Override // h.g.a.p
        public final Object invoke(WriteScope writeScope, e<? super ab> eVar) {
            return ((C04302) create(writeScope, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            WriteScope writeScope = (WriteScope) this.L$0;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.L$0 = null;
                this.label = 1;
                if (writeScope.writeData(this.$value, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
            }
            return ab.f48028a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object readData(StorageConnection<T> storageConnection, e<? super T> eVar) {
        return storageConnection.readScope(new AnonymousClass2(null), eVar);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t, e<? super ab> eVar) {
        Object objWriteScope = storageConnection.writeScope(new C04302(t, null), eVar);
        return objWriteScope == a.f48038a ? objWriteScope : ab.f48028a;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.datastore.core.StorageConnectionKt$readData$2, reason: invalid class name */
    final class AnonymousClass2 extends g implements q<ReadScope, Boolean, e, Object> {
        private /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(e<? super AnonymousClass2> eVar) {
            super(3, eVar);
        }

        @Override // h.g.a.q
        public /* bridge */ /* synthetic */ Object invoke(ReadScope readScope, Boolean bool, e eVar) {
            return invoke(readScope, bool.booleanValue(), eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            ReadScope readScope = (ReadScope) this.L$0;
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c.b(obj);
                return obj;
            }
            c.b(obj);
            this.L$0 = null;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == aVar ? aVar : data;
        }

        public final Object invoke(ReadScope readScope, boolean z, e eVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(eVar);
            anonymousClass2.L$0 = readScope;
            return anonymousClass2.invokeSuspend(ab.f48028a);
        }
    }
}
