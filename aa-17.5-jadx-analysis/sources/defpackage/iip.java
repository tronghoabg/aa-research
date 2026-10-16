package defpackage;

import android.graphics.Picture;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.xml.sax.SAXException;

/* loaded from: classes2.dex */
public final class iip {
    public static final /* synthetic */ int f = 0;
    public ihq a = null;
    public final float b = 96.0f;
    public final igi c = new igi();
    final Map d = new HashMap();
    public float e = 1.0f;

    static {
        new DecimalFormat("#.0000");
        new zu(10);
    }

    protected iip() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ihw g(ihu ihuVar, String str) {
        ihw ihwVarG;
        ihw ihwVar = (ihw) ihuVar;
        if (str.equals(ihwVar.o)) {
            return ihwVar;
        }
        for (Object obj : ihuVar.n()) {
            if (obj instanceof ihw) {
                ihw ihwVar2 = (ihw) obj;
                if (str.equals(ihwVar2.o)) {
                    return ihwVar2;
                }
                if ((obj instanceof ihu) && (ihwVarG = g((ihu) obj, str)) != null) {
                    return ihwVarG;
                }
            }
        }
        return null;
    }

    private final igo h() {
        int i;
        float fG;
        int i2;
        ihq ihqVar = this.a;
        iha ihaVar = ihqVar.c;
        iha ihaVar2 = ihqVar.d;
        if (ihaVar != null && !ihaVar.f() && (i = ihaVar.b) != 9 && i != 2 && i != 3) {
            float fG2 = ihaVar.g();
            if (ihaVar2 == null) {
                igo igoVar = ihqVar.w;
                fG = igoVar != null ? (igoVar.d * fG2) / igoVar.c : fG2;
            } else if (!ihaVar2.f() && (i2 = ihaVar2.b) != 9 && i2 != 2 && i2 != 3) {
                fG = ihaVar2.g();
            }
            return new igo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fG2, fG);
        }
        return new igo(-1.0f, -1.0f, -1.0f, -1.0f);
    }

    public final float a() {
        if (this.a != null) {
            return h().d;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    public final float b() {
        if (this.a != null) {
            return h().c;
        }
        throw new IllegalArgumentException("SVG document is empty");
    }

    protected final ihy c(String str) {
        String strSubstring;
        if (str == null || str.length() <= 1 || !str.startsWith("#") || (strSubstring = str.substring(1)) == null || strSubstring.length() == 0) {
            return null;
        }
        ihq ihqVar = this.a;
        if (strSubstring.equals(ihqVar.o)) {
            return ihqVar;
        }
        Map map = this.d;
        if (map.containsKey(strSubstring)) {
            return (ihy) map.get(strSubstring);
        }
        ihw ihwVarG = g(this.a, strSubstring);
        map.put(strSubstring, ihwVarG);
        return ihwVarG;
    }

    public final void d(String str) throws ijb {
        ihq ihqVar = this.a;
        if (ihqVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        try {
            ihqVar.d = iji.a(str);
        } catch (SAXException e) {
            throw new ijb(e.getMessage());
        }
    }

    public final void e(String str) throws ijb {
        ihq ihqVar = this.a;
        if (ihqVar == null) {
            throw new IllegalArgumentException("SVG document is empty");
        }
        try {
            ihqVar.c = iji.a(str);
        } catch (SAXException e) {
            throw new ijb(e.getMessage());
        }
    }

    public final Picture f(int i, int i2) {
        Picture picture = new Picture();
        ija ijaVar = new ija(picture.beginRecording(i, i2), new igo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2));
        ijaVar.c = this;
        ihq ihqVar = this.a;
        if (ihqVar == null) {
            ija.h("Nothing to render. Document is empty.", new Object[0]);
        } else {
            ijaVar.d = new iiw();
            ijaVar.e = new Stack();
            ijaVar.g(ijaVar.d, ihp.a());
            iiw iiwVar = ijaVar.d;
            iiwVar.f = ijaVar.b;
            iiwVar.h = false;
            iiwVar.i = false;
            ijaVar.e.push(iiwVar.clone());
            new Stack();
            new Stack();
            ijaVar.g = new Stack();
            ijaVar.f = new Stack();
            ijaVar.d(ihqVar);
            ijaVar.f(ihqVar, ihqVar.c, ihqVar.d, ihqVar.w, ihqVar.v);
        }
        picture.endRecording();
        return picture;
    }
}
