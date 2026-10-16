package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.media3.common.C;
import h.ab;
import h.c.e;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily(C.SANS_SERIF_NAME, "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily(C.SERIF_NAME, "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* compiled from: WazeSource */
    public interface Resolver {

        /* compiled from: WazeSource */
        /* renamed from: androidx.compose.ui.text.font.FontFamily$Resolver$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
            public static /* synthetic */ State m10634resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i2, int i3, int i4, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
                }
                if (1 == (i4 & 1)) {
                    fontFamily = null;
                }
                if ((i4 & 2) != 0) {
                    fontWeight = FontWeight.Companion.getNormal();
                }
                if ((i4 & 4) != 0) {
                    i2 = FontStyle.Companion.m10668getNormal_LCdwA();
                }
                if ((i4 & 8) != 0) {
                    i3 = FontSynthesis.Companion.m10678getAllGVVA2EU();
                }
                return resolver.mo10633resolveDPcqOEQ(fontFamily, fontWeight, i2, i3);
            }
        }

        Object preload(FontFamily fontFamily, e<? super ab> eVar);

        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo10633resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i2, int i3);
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ FontFamily(boolean z, o oVar) {
        this(z);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
