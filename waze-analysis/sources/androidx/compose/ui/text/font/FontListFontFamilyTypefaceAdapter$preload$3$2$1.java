package androidx.compose.ui.text.font;

import e.b.c;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.l;
import h.g.a.p;
import java.util.Objects;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends g implements p<af, e<? super Object>, Object> {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, e<? super FontListFontFamilyTypefaceAdapter$preload$3$2$1> eVar) {
        super(2, eVar);
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$font = font;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // h.c.b.a.a
    public final e<ab> create(Object obj, e<?> eVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, eVar);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(af afVar, e<Object> eVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
        FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
        Font font = this.$font;
        PlatformFontLoader platformFontLoader = this.$resourceLoader;
        this.label = 1;
        Object objRunCached = fontListFontFamilyTypefaceAdapter.asyncTypefaceCache.runCached(font, platformFontLoader, true, new AnonymousClass1(font, platformFontLoader, null), this);
        return objRunCached == aVar ? aVar : objRunCached;
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements l<e<? super Object>, Object> {
        final /* synthetic */ Font $font;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Font font, PlatformFontLoader platformFontLoader, e<? super AnonymousClass1> eVar) {
            super(1, eVar);
            this.$font = font;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(e<?> eVar) {
            return new AnonymousClass1(this.$font, this.$resourceLoader, eVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(e<Object> eVar) {
            return ((AnonymousClass1) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            try {
                if (i2 == 0) {
                    c.b(obj);
                    this.label = 1;
                    obj = aj.G(15000L, new C00911(this.$resourceLoader, this.$font, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c.b(obj);
                }
                if (obj != null) {
                    return obj;
                }
                Font font = this.$font;
                Objects.toString(font);
                throw new IllegalStateException("Unable to load font ".concat(String.valueOf(font)));
            } catch (Exception e2) {
                Font font2 = this.$font;
                Objects.toString(font2);
                throw new IllegalStateException("Unable to load font ".concat(String.valueOf(font2)), e2);
            }
        }

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C00911 extends g implements p<af, e<? super Object>, Object> {
            final /* synthetic */ Font $font;
            final /* synthetic */ PlatformFontLoader $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00911(PlatformFontLoader platformFontLoader, Font font, e<? super C00911> eVar) {
                super(2, eVar);
                this.$resourceLoader = platformFontLoader;
                this.$font = font;
            }

            @Override // h.c.b.a.a
            public final e<ab> create(Object obj, e<?> eVar) {
                return new C00911(this.$resourceLoader, this.$font, eVar);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(af afVar, e<Object> eVar) {
                return ((C00911) create(afVar, eVar)).invokeSuspend(ab.f48028a);
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
                Object objAwaitLoad = this.$resourceLoader.awaitLoad(this.$font, this);
                return objAwaitLoad == aVar ? aVar : objAwaitLoad;
            }

            @Override // h.g.a.p
            public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super Object> eVar) {
                return invoke2(afVar, (e<Object>) eVar);
            }
        }

        @Override // h.g.a.l
        public /* bridge */ /* synthetic */ Object invoke(e<? super Object> eVar) {
            return invoke2((e<Object>) eVar);
        }
    }

    @Override // h.g.a.p
    public /* bridge */ /* synthetic */ Object invoke(af afVar, e<? super Object> eVar) {
        return invoke2(afVar, (e<Object>) eVar);
    }
}
