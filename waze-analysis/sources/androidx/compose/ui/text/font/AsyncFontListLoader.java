package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import h.ab;
import h.c.b.a.c;
import h.c.e;
import h.g.a.l;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final l<TypefaceResult.Immutable, ab> onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.AsyncFontListLoader$load$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AsyncFontListLoader.this.load(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, l<? super TypefaceResult.Immutable, ab> lVar, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = lVar;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e1, code lost:
    
        if (h.g.b.w.b(r15) != r1) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e6, blocks: (B:13:0x0031, B:31:0x009f, B:34:0x00d3, B:18:0x004c, B:21:0x0056), top: B:48:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3 A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00e6, blocks: (B:13:0x0031, B:31:0x009f, B:34:0x00d3, B:18:0x004c, B:21:0x0056), top: B:48:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00e1 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e8 -> B:41:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(h.c.e<? super h.ab> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.load(h.c.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadWithTimeoutOrNull$ui_text(androidx.compose.ui.text.font.Font r6, h.c.e<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = (androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1 r0 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.ui.text.font.Font) r6
            e.b.c.b(r7)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            return r7
        L2d:
            r5 = move-exception
            goto L4f
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            e.b.c.b(r7)
            androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2 r7 = new androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            h.g.a.p r7 = (h.g.a.p) r7     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            r0.L$0 = r6     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            r0.label = r3     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r5 = kotlinx.coroutines.aj.I(r2, r7, r0)     // Catch: java.lang.Exception -> L2d java.util.concurrent.CancellationException -> L7e
            if (r5 != r1) goto L4e
            return r1
        L4e:
            return r5
        L4f:
            h.c.j r7 = r0.getContext()
            kotlinx.coroutines.ac r1 = kotlinx.coroutines.CoroutineExceptionHandler.f51269c
            h.c.i r1 = (h.c.i) r1
            h.c.h r7 = r7.get(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r7 = (kotlinx.coroutines.CoroutineExceptionHandler) r7
            if (r7 != 0) goto L60
            goto L89
        L60:
            h.c.j r0 = r0.getContext()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Objects.toString(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            java.lang.String r2 = "Unable to load font "
            java.lang.String r6 = r2.concat(r6)
            r1.<init>(r6, r5)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r7.handleException(r0, r1)
            return r4
        L7e:
            r5 = move-exception
            h.c.j r6 = r0.getContext()
            boolean r6 = h.g.b.o.h(r6)
            if (r6 == 0) goto L8a
        L89:
            return r4
        L8a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AsyncFontListLoader.loadWithTimeoutOrNull$ui_text(androidx.compose.ui.text.font.Font, h.c.e):java.lang.Object");
    }

    public final void setCacheable$ui_text(boolean z) {
        this.cacheable = z;
    }
}
