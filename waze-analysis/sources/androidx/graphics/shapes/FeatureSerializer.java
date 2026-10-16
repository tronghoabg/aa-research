package androidx.graphics.shapes;

import androidx.graphics.shapes.Feature;
import androidx.graphics.shapes.FeatureSerializer;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import h.a.c;
import h.a.i;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.n.g;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FeatureSerializer {
    private static final String LOG_TAG = "FeatureSerializer";
    private static final char SEPARATOR = ',';
    public static final Companion Companion = new Companion(null);
    private static final char EDGE_CHAR = 'n';
    private static final char CONVEX_CORNER_CHAR = 'x';
    private static final char CONCAVE_CORNER_CHAR = 'o';
    private static final char[] FEATURE_TAG_ARRAY = {EDGE_CHAR, CONVEX_CORNER_CHAR, CONCAVE_CORNER_CHAR};

    private FeatureSerializer() {
    }

    public static final List<Feature> parse(String str) {
        return Companion.parse(str);
    }

    public static final String serialize(List<? extends Feature> list) {
        return Companion.serialize(list);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final List<Cubic> parseCubics(String str, int i2, int i3) throws NumberFormatException {
            float[] fArr = new float[8];
            List listB = i.b();
            int i4 = i2;
            int i5 = i4;
            int i6 = 0;
            while (i4 < i3) {
                int i7 = i4 + 1;
                if (str.charAt(i4) != ',') {
                    i4 = i7;
                } else {
                    int i8 = i6 + 1;
                    String strSubstring = str.substring(i5, i4);
                    x.e(strSubstring, "substring(...)");
                    fArr[i6] = Float.parseFloat(strSubstring);
                    if (i8 == 8) {
                        listB.add(new Cubic(fArr));
                        float f2 = fArr[6];
                        float f3 = fArr[7];
                        float[] fArr2 = new float[8];
                        fArr2[0] = f2;
                        fArr2[1] = f3;
                        i6 -= 5;
                        fArr = fArr2;
                    } else {
                        i6 = i8;
                    }
                    i4 = i7;
                    i5 = i4;
                }
            }
            int i9 = i6 + 1;
            if (i9 == 8) {
                String strSubstring2 = str.substring(i5, i4);
                x.e(strSubstring2, "substring(...)");
                fArr[7] = Float.parseFloat(strSubstring2);
                listB.add(new Cubic(fArr));
                return i.a(listB);
            }
            try {
                String strSubstring3 = str.substring(i5, i4);
                x.e(strSubstring3, "substring(...)");
                Float.parseFloat(strSubstring3);
                i6 = i9;
            } catch (NumberFormatException unused) {
            }
            String strSubstring4 = str.substring(i2 - 1, i3);
            x.e(strSubstring4, "substring(...)");
            throw new IllegalArgumentException("Received a feature with an insufficient amount of numbers for substring '" + strSubstring4 + "'. Wanted to create " + (listB.size() + 1) + " continuous cubic bezier curves for this feature, but the last one is missing " + (8 - i6) + " more numbers separated by ','.");
        }

        private final Feature parseFeature(String str, int i2, int i3) {
            int i4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            return cCharAt != 'n' ? cCharAt != 'o' ? cCharAt != 'x' ? new Feature.Edge(parseCubics(str, i4, i3)) : new Feature.Corner(parseCubics(str, i4, i3), true) : new Feature.Corner(parseCubics(str, i4, i3), false) : new Feature.Edge(parseCubics(str, i4, i3));
        }

        private final String removeTrailingZeroes(String str) {
            String strSubSequence;
            String strSubSequence2;
            String str2 = str;
            int length = str2.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    if (str2.charAt(length) != '0') {
                        strSubSequence = str2.subSequence(0, length + 1);
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
            String string = strSubSequence.toString();
            int length2 = string.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i3 = length2 - 1;
                    if (string.charAt(length2) != '.') {
                        strSubSequence2 = string.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    length2 = i3;
                }
            }
            return strSubSequence2.toString();
        }

        private final String serializeCubics(List<? extends Cubic> list) {
            StringBuilder sb = new StringBuilder();
            Iterator<? extends Cubic> it = list.iterator();
            while (it.hasNext()) {
                sb.append(c.aD(it.next().getPoints$graphics_shapes(), ",", 6, "", new l() { // from class: androidx.graphics.shapes.FeatureSerializer$Companion$$ExternalSyntheticLambda0
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return FeatureSerializer.Companion.serializeCubics$lambda$0$0(((Float) obj).floatValue());
                    }
                }, 6));
            }
            sb.append(FeatureSerializer.Companion.removeTrailingZeroes(String.valueOf(((Cubic) i.T(list)).getAnchor1X())) + "," + FeatureSerializer.Companion.removeTrailingZeroes(String.valueOf(((Cubic) i.T(list)).getAnchor1Y())));
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CharSequence serializeCubics$lambda$0$0(float f2) {
            return FeatureSerializer.Companion.removeTrailingZeroes(String.valueOf(f2));
        }

        private final String serializeFeature(Feature feature) {
            if (feature instanceof Feature.Edge) {
                return "n" + serializeCubics(feature.getCubics());
            }
            if (!(feature instanceof Feature.Corner)) {
                return "n" + serializeCubics(feature.getCubics());
            }
            return (true != ((Feature.Corner) feature).getConvex() ? FeatureSerializer.CONCAVE_CORNER_CHAR : FeatureSerializer.CONVEX_CORNER_CHAR) + serializeCubics(feature.getCubics());
        }

        public final List<Feature> parse(String str) throws IOException {
            int length;
            x.f(str, "serializedFeatures");
            String str2 = str;
            g gVarH = h.n.l.h(new h.n.l("^\\s*V(\\d+)"), str2);
            if (gVarH == null || gVarH.b().size() < 2) {
                length = 0;
            } else {
                x.n(gVarH.b().get(1), IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                length = gVarH.a().length();
            }
            g gVarD = new h.n.l("[a-zA-Z]").d(str2, length);
            if (gVarD != null) {
                List listB = i.b();
                while (gVarD != null) {
                    int iA = gVarD.c().a();
                    gVarD = gVarD.d();
                    listB.add(FeatureSerializer.Companion.parseFeature(str, iA, gVarD != null ? gVarD.c().a() : str.length()));
                }
                return i.a(listB);
            }
            char[] cArr = FeatureSerializer.FEATURE_TAG_ARRAY;
            x.f(cArr, "<this>");
            x.f(str, "separator");
            x.f(str, "prefix");
            x.f(str, "postfix");
            x.f(str, "truncated");
            StringBuilder sb = new StringBuilder();
            x.f(cArr, "<this>");
            x.f(sb, "buffer");
            x.f(str, "separator");
            x.f(str, "prefix");
            x.f(str, "postfix");
            x.f(str, "truncated");
            sb.append((CharSequence) str);
            int i2 = 0;
            for (char c2 : cArr) {
                i2++;
                if (i2 > 1) {
                    sb.append((CharSequence) str);
                }
                sb.append(c2);
            }
            sb.append((CharSequence) str);
            throw new IllegalArgumentException("Could not find any feature tags. Please mark all cubic bezier curve points belonging to a feature with one of {" + sb.toString() + "} for V1, e.g. 'n1,1,2,2,3,3,4,4' for an edge (n) with anchor 0 (1,1), control 0 (2,2), control 1 (3,3) and anchor 1 (4,4).");
        }

        public final String serialize(List<? extends Feature> list) {
            x.f(list, "features");
            StringBuilder sb = new StringBuilder("V1");
            Iterator<? extends Feature> it = list.iterator();
            while (it.hasNext()) {
                sb.append(FeatureSerializer.Companion.serializeFeature(it.next()));
            }
            return sb.toString();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
