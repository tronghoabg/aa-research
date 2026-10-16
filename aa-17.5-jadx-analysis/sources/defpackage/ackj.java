package defpackage;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Log;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes3.dex */
public final class ackj extends DefaultHandler {
    private static final Matrix v = new Matrix();
    final Picture b;
    Canvas c;
    Paint d;
    Paint h;
    public final HashMap a = new HashMap();
    boolean e = false;
    final Stack f = new Stack();
    final Stack g = new Stack();
    boolean i = false;
    final Stack j = new Stack();
    final Stack k = new Stack();
    float l = 1.0f;
    final Stack m = new Stack();
    final RectF n = new RectF();
    public final RectF o = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public float p = 72.0f;
    int q = 0;
    private boolean w = false;
    private int x = 0;
    private boolean y = false;
    final HashMap r = new HashMap();
    final HashMap s = new HashMap();
    ackg t = null;
    acki u = null;
    private boolean z = false;

    public ackj(Picture picture) {
        this.b = picture;
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setAntiAlias(true);
        this.h.setStyle(Paint.Style.FILL);
    }

    private final ackg e(boolean z, Attributes attributes) {
        ackg ackgVar = new ackg();
        ackgVar.a = aclf.h("id", attributes);
        ackgVar.c = z;
        Float fValueOf = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        if (z) {
            ackgVar.d = a("x1", attributes, fValueOf).floatValue();
            ackgVar.f = a("x2", attributes, fValueOf).floatValue();
            ackgVar.e = a("y1", attributes, fValueOf).floatValue();
            ackgVar.g = a("y2", attributes, fValueOf).floatValue();
        } else {
            ackgVar.h = a("cx", attributes, fValueOf).floatValue();
            ackgVar.i = a("cy", attributes, fValueOf).floatValue();
            ackgVar.j = a("r", attributes, fValueOf).floatValue();
        }
        String strH = aclf.h("gradientTransform", attributes);
        if (strH != null) {
            ackgVar.m = aclf.f(strH);
        }
        String strH2 = aclf.h("href", attributes);
        if (strH2 != null) {
            if (strH2.startsWith("#")) {
                strH2 = strH2.substring(1);
            }
            ackgVar.b = strH2;
        }
        return ackgVar;
    }

    private final void f(ackh ackhVar, Integer num, boolean z, Paint paint) {
        paint.setColor((num.intValue() & 16777215) | (-16777216));
        Float fA = ackhVar.a("opacity");
        if (fA == null) {
            fA = ackhVar.a(true != z ? "stroke-opacity" : "fill-opacity");
        }
        if (fA == null) {
            fA = Float.valueOf(1.0f);
        }
        num.intValue();
        paint.setAlpha((int) (fA.floatValue() * 255.0f * this.l));
    }

    private final void g(Path path) {
        RectF rectF = this.n;
        path.computeBounds(rectF, false);
        h(rectF.left, rectF.top);
        h(rectF.right, rectF.bottom);
    }

    private final void h(float f, float f2) {
        RectF rectF = this.o;
        if (f < rectF.left) {
            rectF.left = f;
        }
        if (f > rectF.right) {
            rectF.right = f;
        }
        if (f2 < rectF.top) {
            rectF.top = f2;
        }
        if (f2 > rectF.bottom) {
            rectF.bottom = f2;
        }
    }

    private final void i(float f, float f2, float f3, float f4) {
        h(f, f2);
        h(f + f3, f2 + f4);
    }

    private final void j() {
        this.c.restore();
        this.q--;
    }

    private final void k(Attributes attributes) {
        String strH = aclf.h("transform", attributes);
        Matrix matrixF = strH == null ? v : aclf.f(strH);
        this.q++;
        this.c.save();
        this.c.concat(matrixF);
    }

    private static final Paint.Align l(Attributes attributes) {
        String strH = aclf.h("text-anchor", attributes);
        if (strH == null) {
            return null;
        }
        return "middle".equals(strH) ? Paint.Align.CENTER : "end".equals(strH) ? Paint.Align.RIGHT : Paint.Align.LEFT;
    }

    public final Float a(String str, Attributes attributes, Float f) throws NumberFormatException {
        Float fValueOf;
        int width;
        float height;
        float f2 = this.p;
        String strH = aclf.h(str, attributes);
        if (strH == null) {
            fValueOf = null;
        } else if (strH.endsWith("px")) {
            fValueOf = Float.valueOf(Float.parseFloat(strH.substring(0, strH.length() - 2)));
        } else if (strH.endsWith("pt")) {
            fValueOf = Float.valueOf((Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * f2) / 72.0f);
        } else if (strH.endsWith("pc")) {
            fValueOf = Float.valueOf((Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * f2) / 6.0f);
        } else if (strH.endsWith("cm")) {
            fValueOf = Float.valueOf((Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * f2) / 2.54f);
        } else if (strH.endsWith("mm")) {
            fValueOf = Float.valueOf((Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * f2) / 254.0f);
        } else if (strH.endsWith("in")) {
            fValueOf = Float.valueOf(Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * f2);
        } else if (strH.endsWith("em")) {
            fValueOf = Float.valueOf(Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * this.h.getTextSize());
        } else if (strH.endsWith("ex")) {
            fValueOf = Float.valueOf((Float.valueOf(strH.substring(0, strH.length() - 2)).floatValue() * this.h.getTextSize()) / 2.0f);
        } else if (strH.endsWith("%")) {
            Float fValueOf2 = Float.valueOf(strH.substring(0, strH.length() - 1));
            if (str.indexOf("x") >= 0 || str.equals("width")) {
                width = this.c.getWidth();
            } else if (str.indexOf("y") >= 0 || str.equals("height")) {
                width = this.c.getHeight();
            } else {
                height = (this.c.getHeight() + this.c.getWidth()) / 2.0f;
                fValueOf = Float.valueOf(fValueOf2.floatValue() * height);
            }
            height = width / 100.0f;
            fValueOf = Float.valueOf(fValueOf2.floatValue() * height);
        } else {
            fValueOf = Float.valueOf(strH);
        }
        return fValueOf == null ? f : fValueOf;
    }

    public final boolean b(ackh ackhVar, HashMap map) throws NumberFormatException {
        if ("none".equals(ackhVar.c("display"))) {
            return false;
        }
        String strC = ackhVar.c("fill");
        if (strC == null) {
            boolean z = this.i;
            Paint paint = this.h;
            if (z) {
                return paint.getColor() != 0;
            }
            paint.setShader(null);
            this.h.setColor(-16777216);
            return true;
        }
        if (strC.startsWith("url(#")) {
            String strSubstring = strC.substring(5, strC.length() - 1);
            Shader shader = (Shader) map.get(strSubstring);
            if (shader != null) {
                this.h.setShader(shader);
                return true;
            }
            Log.w("SVG", "Didn't find shader, using black: ".concat(String.valueOf(strSubstring)));
            this.h.setShader(null);
            f(ackhVar, -16777216, true, this.h);
            return true;
        }
        boolean zEqualsIgnoreCase = strC.equalsIgnoreCase("none");
        Paint paint2 = this.h;
        if (zEqualsIgnoreCase) {
            paint2.setShader(null);
            this.h.setColor(0);
            return true;
        }
        paint2.setShader(null);
        Integer numB = ackhVar.b("fill");
        if (numB != null) {
            f(ackhVar, numB, true, this.h);
            return true;
        }
        Log.w("SVG", "Unrecognized fill color, using black: ".concat(strC));
        f(ackhVar, -16777216, true, this.h);
        return true;
    }

    public final boolean c(ackh ackhVar) throws NumberFormatException {
        if ("none".equals(ackhVar.c("display"))) {
            return false;
        }
        Float fA = ackhVar.a("stroke-width");
        if (fA != null) {
            this.d.setStrokeWidth(fA.floatValue());
        }
        float strokeWidth = this.d.getStrokeWidth();
        float f = BitmapDescriptorFactory.HUE_RED;
        if (strokeWidth <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        String strC = ackhVar.c("stroke-linecap");
        if ("round".equals(strC)) {
            this.d.setStrokeCap(Paint.Cap.ROUND);
        } else if ("square".equals(strC)) {
            this.d.setStrokeCap(Paint.Cap.SQUARE);
        } else if ("butt".equals(strC)) {
            this.d.setStrokeCap(Paint.Cap.BUTT);
        }
        String strC2 = ackhVar.c("stroke-linejoin");
        if ("miter".equals(strC2)) {
            this.d.setStrokeJoin(Paint.Join.MITER);
        } else if ("round".equals(strC2)) {
            this.d.setStrokeJoin(Paint.Join.ROUND);
        } else if ("bevel".equals(strC2)) {
            this.d.setStrokeJoin(Paint.Join.BEVEL);
        }
        String strC3 = ackhVar.c("stroke-dasharray");
        String strC4 = ackhVar.c("stroke-dashoffset");
        if (strC3 != null) {
            if (strC3.equals("none")) {
                this.d.setPathEffect(null);
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(strC3, " ,");
                int iCountTokens = stringTokenizer.countTokens();
                if ((iCountTokens & 1) == 1) {
                    iCountTokens += iCountTokens;
                }
                float[] fArr = new float[iCountTokens];
                float f2 = 1.0f;
                int i = 0;
                float f3 = 0.0f;
                while (stringTokenizer.hasMoreTokens()) {
                    int i2 = i + 1;
                    try {
                        f2 = Float.parseFloat(stringTokenizer.nextToken());
                    } catch (NumberFormatException unused) {
                    }
                    fArr[i] = f2;
                    f3 += f2;
                    i = i2;
                }
                int i3 = 0;
                while (i < iCountTokens) {
                    float f4 = fArr[i3];
                    fArr[i] = f4;
                    f3 += f4;
                    i++;
                    i3++;
                }
                if (strC4 != null) {
                    try {
                        f = Float.parseFloat(strC4) % f3;
                    } catch (NumberFormatException unused2) {
                    }
                }
                this.d.setPathEffect(new DashPathEffect(fArr, f));
            }
        }
        String strC5 = ackhVar.c("stroke");
        if (strC5 == null) {
            boolean z = this.e;
            Paint paint = this.d;
            if (z) {
                return paint.getColor() != 0;
            }
            paint.setColor(0);
            return false;
        }
        if (strC5.equalsIgnoreCase("none")) {
            this.d.setColor(0);
            return false;
        }
        Integer numB = ackhVar.b("stroke");
        if (numB != null) {
            f(ackhVar, numB, false, this.d);
            return true;
        }
        Log.d("SVG", "Unrecognized stroke color, using none: ".concat(strC5));
        this.d.setColor(0);
        return false;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        acki ackiVar = this.u;
        if (ackiVar == null || !ackiVar.f) {
            return;
        }
        String str = ackiVar.e;
        if (str == null) {
            ackiVar.e = new String(cArr, i, i2);
        } else {
            ackiVar.e = str.concat(new String(cArr, i, i2));
        }
        if (ackiVar.g > 0) {
            Paint paint = ackiVar.a;
            if (paint == null) {
                paint = ackiVar.b;
            }
            Rect rect = new Rect();
            String str2 = ackiVar.e;
            paint.getTextBounds(str2, 0, str2.length(), rect);
            ackiVar.d += ackiVar.g == 1 ? -rect.centerY() : rect.height();
        }
    }

    public final void d(Attributes attributes, Paint paint) {
        Typeface typefaceCreate;
        if ("none".equals(attributes.getValue("display"))) {
            return;
        }
        if (attributes.getValue("font-size") != null) {
            paint.setTextSize(a("font-size", attributes, Float.valueOf(10.0f)).floatValue());
        }
        String strH = aclf.h("font-family", attributes);
        String strH2 = aclf.h("font-style", attributes);
        String strH3 = aclf.h("font-weight", attributes);
        if (strH == null && strH2 == null && strH3 == null) {
            typefaceCreate = null;
        } else {
            int i = true != "italic".equals(strH2) ? 0 : 2;
            if ("bold".equals(strH3)) {
                i |= 1;
            }
            typefaceCreate = Typeface.create(strH, i);
        }
        if (typefaceCreate != null) {
            paint.setTypeface(typefaceCreate);
        }
        if (l(attributes) != null) {
            paint.setTextAlign(l(attributes));
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) {
        ackg ackgVar;
        ackg ackgVar2;
        ackg ackgVar3;
        ackg ackgVar4;
        int i = 0;
        if (this.z) {
            if (str2.equals("defs")) {
                this.z = false;
                return;
            }
            return;
        }
        if (str2.equals("svg")) {
            this.b.endRecording();
            return;
        }
        if (!this.w && str2.equals("text")) {
            acki ackiVar = this.u;
            if (ackiVar != null) {
                Canvas canvas = this.c;
                Paint paint = ackiVar.b;
                if (paint != null) {
                    canvas.drawText(ackiVar.e, ackiVar.c, ackiVar.d, paint);
                }
                Paint paint2 = ackiVar.a;
                if (paint2 != null) {
                    canvas.drawText(ackiVar.e, ackiVar.c, ackiVar.d, paint2);
                }
                this.u.f = false;
            }
            j();
            return;
        }
        if (str2.equals("linearGradient")) {
            ackg ackgVar5 = this.t;
            if (ackgVar5.a != null) {
                String str4 = ackgVar5.b;
                if (str4 != null && (ackgVar4 = (ackg) this.s.get(str4)) != null) {
                    this.t = ackgVar4.a(this.t);
                }
                int size = this.t.l.size();
                int[] iArr = new int[size];
                int i2 = 0;
                while (true) {
                    ackgVar3 = this.t;
                    if (i2 >= size) {
                        break;
                    }
                    iArr[i2] = ((Integer) ackgVar3.l.get(i2)).intValue();
                    i2++;
                }
                int size2 = ackgVar3.k.size();
                float[] fArr = new float[size2];
                while (i < size2) {
                    fArr[i] = ((Float) this.t.k.get(i)).floatValue();
                    i++;
                }
                if (size == 0) {
                    Log.d("SVG", "missing colors in gradient");
                }
                ackg ackgVar6 = this.t;
                LinearGradient linearGradient = new LinearGradient(ackgVar6.d, ackgVar6.e, ackgVar6.f, ackgVar6.g, iArr, fArr, Shader.TileMode.CLAMP);
                Matrix matrix = this.t.m;
                if (matrix != null) {
                    linearGradient.setLocalMatrix(matrix);
                }
                this.r.put(this.t.a, linearGradient);
                HashMap map = this.s;
                ackg ackgVar7 = this.t;
                map.put(ackgVar7.a, ackgVar7);
                return;
            }
            return;
        }
        if (!str2.equals("radialGradient")) {
            if (str2.equals("g")) {
                if (this.y) {
                    this.y = false;
                }
                if (this.w) {
                    int i3 = this.x - 1;
                    this.x = i3;
                    if (i3 == 0) {
                        this.w = false;
                    }
                }
                this.r.clear();
                j();
                this.h = (Paint) this.j.pop();
                this.i = ((Boolean) this.k.pop()).booleanValue();
                this.d = (Paint) this.f.pop();
                this.e = ((Boolean) this.g.pop()).booleanValue();
                this.l = ((Float) this.m.pop()).floatValue();
                return;
            }
            return;
        }
        ackg ackgVar8 = this.t;
        if (ackgVar8.a != null) {
            String str5 = ackgVar8.b;
            if (str5 != null && (ackgVar2 = (ackg) this.s.get(str5)) != null) {
                this.t = ackgVar2.a(this.t);
            }
            int size3 = this.t.l.size();
            int[] iArr2 = new int[size3];
            int i4 = 0;
            while (true) {
                ackgVar = this.t;
                if (i4 >= size3) {
                    break;
                }
                iArr2[i4] = ((Integer) ackgVar.l.get(i4)).intValue();
                i4++;
            }
            int size4 = ackgVar.k.size();
            float[] fArr2 = new float[size4];
            while (i < size4) {
                fArr2[i] = ((Float) this.t.k.get(i)).floatValue();
                i++;
            }
            ackg ackgVar9 = this.t;
            RadialGradient radialGradient = new RadialGradient(ackgVar9.h, ackgVar9.i, ackgVar9.j, iArr2, fArr2, Shader.TileMode.CLAMP);
            Matrix matrix2 = this.t.m;
            if (matrix2 != null) {
                radialGradient.setLocalMatrix(matrix2);
            }
            this.r.put(this.t.a, radialGradient);
            HashMap map2 = this.s;
            ackg ackgVar10 = this.t;
            map2.put(ackgVar10.a, ackgVar10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x032e A[PHI: r1
  0x032e: PHI (r1v56 java.lang.Float) = (r1v55 java.lang.Float), (r1v54 java.lang.Float) binds: [B:137:0x032c, B:133:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v70 */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startElement(java.lang.String r59, java.lang.String r60, java.lang.String r61, org.xml.sax.Attributes r62) throws org.xml.sax.SAXException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ackj.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
    }
}
