package androidx.compose.ui.text.font;

import androidx.collection.MutableScatterSet;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.c.j;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.k;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private af asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final CoroutineExceptionHandler DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.f51269c);

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3, reason: invalid class name */
    final class AnonymousClass3 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ List<Font> $asyncLoads;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(List<Font> list, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, PlatformFontLoader platformFontLoader, e<? super AnonymousClass3> eVar) {
            super(2, eVar);
            this.$asyncLoads = list;
            this.this$0 = fontListFontFamilyTypefaceAdapter;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$asyncLoads, this.this$0, this.$resourceLoader, eVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass3) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                af afVar = (af) this.L$0;
                List<Font> list = this.$asyncLoads;
                MutableScatterSet mutableScatterSet = new MutableScatterSet(list.size());
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Font font = list.get(i3);
                    if (mutableScatterSet.add(font)) {
                        arrayList.add(font);
                    }
                }
                ArrayList arrayList2 = arrayList;
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter = this.this$0;
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                ArrayList arrayList3 = new ArrayList(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList3.add(aj.y(afVar, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(fontListFontFamilyTypefaceAdapter, (Font) arrayList2.get(i4), platformFontLoader, null), 3));
                }
                this.label = 1;
                if (aj.E(arrayList3, this) == aVar) {
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

    /* compiled from: WazeSource */
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ AsyncFontListLoader $asyncLoader;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AsyncFontListLoader asyncFontListLoader, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$asyncLoader = asyncFontListLoader;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$asyncLoader, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                c.b(obj);
                this.label = 1;
                if (this.$asyncLoader.load(this) == aVar) {
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

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, j jVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = aj.e(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(jVar).plus(aj.P((br) jVar.get(br.f51766a))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab preload$lambda$3$0(TypefaceRequest typefaceRequest) {
        return ab.f48028a;
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, e<? super ab> eVar) {
        if (fontFamily instanceof FontListFontFamily) {
            FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily;
            List<Font> fonts = fontListFontFamily.getFonts();
            List<Font> fonts2 = fontListFontFamily.getFonts();
            ArrayList arrayList = new ArrayList(fonts2.size());
            int size = fonts2.size();
            for (int i2 = 0; i2 < size; i2++) {
                Font font = fonts2.get(i2);
                if (FontLoadingStrategy.m10648equalsimpl0(font.mo10603getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m10652getAsyncPKNRLFQ())) {
                    arrayList.add(new k(font.getWeight(), FontStyle.m10658boximpl(font.mo10613getStyle_LCdwA())));
                }
            }
            ArrayList arrayList2 = arrayList;
            MutableScatterSet mutableScatterSet = new MutableScatterSet(arrayList2.size());
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object obj = arrayList2.get(i3);
                if (mutableScatterSet.add((k) obj)) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = arrayList3;
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                k kVar = (k) arrayList4.get(i4);
                FontWeight fontWeight = (FontWeight) kVar.a();
                int iM10664unboximpl = ((FontStyle) kVar.b()).m10664unboximpl();
                List list = (List) FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m10657matchFontRetOiIg(fonts, fontWeight, iM10664unboximpl), new TypefaceRequest(fontFamily, fontWeight, iM10664unboximpl, FontSynthesis.Companion.m10678getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new l() { // from class: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj2) {
                        return FontListFontFamilyTypefaceAdapter.preload$lambda$3$0((TypefaceRequest) obj2);
                    }
                }).a();
                if (list != null) {
                    arrayList5.add(i.P(list));
                }
            }
            Object objD = aj.d(new AnonymousClass3(arrayList5, this, platformFontLoader, null), eVar);
            if (objD == a.f48038a) {
                return objD;
            }
        }
        return ab.f48028a;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, l<? super TypefaceResult.Immutable, ab> lVar, l<? super TypefaceRequest, ? extends Object> lVar2) {
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        k kVarFirstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m10657matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m10707getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, lVar2);
        List list = (List) kVarFirstImmediatelyAvailable.a();
        Object objB = kVarFirstImmediatelyAvailable.b();
        if (list == null) {
            return new TypefaceResult.Immutable(objB, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, objB, typefaceRequest, this.asyncTypefaceCache, lVar, platformFontLoader);
        aj.z(this.asyncLoadScope, null, ag.f51345d, new AnonymousClass1(asyncFontListLoader, null), 1);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, h.c.k kVar, int i2, o oVar) {
        this((i2 & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i2 & 2) != 0 ? h.c.k.f48060a : kVar);
    }
}
