package Ca;

import N1.D;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes4.dex */
public abstract class d implements com.unity3d.scar.adapter.common.e {

    /* renamed from: a, reason: collision with root package name */
    public Object f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f1971b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1972c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1973d;

    public d(String str, Rect rect, List list, String str2) {
        this.f1970a = str;
        this.f1972c = new Rect(rect);
        Point[] pointArr = new Point[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            pointArr[i5] = new Point((Point) list.get(i5));
        }
        this.f1973d = pointArr;
        this.f1971b = str2;
    }

    public static int j(XmlPullParser xmlPullParser, String str) throws D {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -1;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e7) {
            throw D.b(null, e7);
        }
    }

    public static long k(XmlPullParser xmlPullParser, String str, long j8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j8;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e7) {
            throw D.b(null, e7);
        }
    }

    public static int l(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new j2.d(str, 0);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e7) {
            throw D.b(null, e7);
        }
    }

    public abstract Object e();

    public Object f(String str) {
        int i5 = 0;
        while (true) {
            LinkedList linkedList = (LinkedList) this.f1973d;
            if (i5 >= linkedList.size()) {
                d dVar = (d) this.f1972c;
                if (dVar == null) {
                    return null;
                }
                return dVar.f(str);
            }
            Pair pair = (Pair) linkedList.get(i5);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
            i5++;
        }
    }

    public boolean g(String str) {
        return false;
    }

    public Object h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        boolean z2 = false;
        int i5 = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d hVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (((String) this.f1971b).equals(name)) {
                    m(xmlPullParser);
                    z2 = true;
                } else if (z2) {
                    if (i5 > 0) {
                        i5++;
                    } else if (g(name)) {
                        m(xmlPullParser);
                    } else {
                        boolean zEquals = "QualityLevel".equals(name);
                        String str = (String) this.f1970a;
                        if (zEquals) {
                            hVar = new j2.f(this, str, "QualityLevel");
                        } else if ("Protection".equals(name)) {
                            hVar = new j2.e(this, str, "Protection");
                        } else if ("StreamIndex".equals(name)) {
                            hVar = new j2.h(this, str);
                        }
                        if (hVar == null) {
                            i5 = 1;
                        } else {
                            d(hVar.h(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z2 && i5 == 0) {
                    n(xmlPullParser);
                }
            } else if (!z2) {
                continue;
            } else if (i5 > 0) {
                i5--;
            } else {
                String name2 = xmlPullParser.getName();
                i(xmlPullParser);
                if (!g(name2)) {
                    return e();
                }
            }
            xmlPullParser.next();
        }
    }

    public abstract void m(XmlPullParser xmlPullParser);

    public void o(Object obj, String str) {
        ((LinkedList) this.f1973d).add(Pair.create(str, obj));
    }

    public String p() {
        String str = (String) this.f1970a;
        return str == null ? "" : str;
    }

    public d(com.unity3d.scar.adapter.common.c cVar) {
        this.f1971b = new ConcurrentHashMap();
        this.f1973d = cVar;
    }

    public d(d dVar, String str, String str2) {
        this.f1972c = dVar;
        this.f1970a = str;
        this.f1971b = str2;
        this.f1973d = new LinkedList();
    }

    public void d(Object obj) {
    }

    public void i(XmlPullParser xmlPullParser) {
    }

    public void n(XmlPullParser xmlPullParser) {
    }
}
