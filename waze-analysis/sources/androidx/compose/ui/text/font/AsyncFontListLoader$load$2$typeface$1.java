package androidx.compose.ui.text.font;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AsyncFontListLoader$load$2$typeface$1 extends g implements l<e<? super Object>, Object> {
    final /* synthetic */ Font $font;
    int label;
    final /* synthetic */ AsyncFontListLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AsyncFontListLoader$load$2$typeface$1(AsyncFontListLoader asyncFontListLoader, Font font, e<? super AsyncFontListLoader$load$2$typeface$1> eVar) {
        super(1, eVar);
        this.this$0 = asyncFontListLoader;
        this.$font = font;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(e<?> eVar) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(e<Object> eVar) {
        return ((AsyncFontListLoader$load$2$typeface$1) create(eVar)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
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
        this.label = 1;
        Object objLoadWithTimeoutOrNull$ui_text = this.this$0.loadWithTimeoutOrNull$ui_text(this.$font, this);
        return objLoadWithTimeoutOrNull$ui_text == aVar ? aVar : objLoadWithTimeoutOrNull$ui_text;
    }

    @Override // h.g.a.l
    public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar) {
        return invoke2((e<Object>) eVar);
    }
}
