package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import i.AbstractC2820a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p.n;
import q.AbstractC3827n0;

/* renamed from: o.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3628i extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f41229e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class[] f41230f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f41231a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f41232b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f41233c;

    /* renamed from: d, reason: collision with root package name */
    public Object f41234d;

    static {
        Class[] clsArr = {Context.class};
        f41229e = clsArr;
        f41230f = clsArr;
    }

    public C3628i(Context context) {
        super(context);
        this.f41233c = context;
        Object[] objArr = {context};
        this.f41231a = objArr;
        this.f41232b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r42;
        int i5;
        XmlResourceParser xmlResourceParser2;
        boolean z2;
        ColorStateList colorStateList;
        int resourceId;
        C3627h c3627h = new C3627h(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r42 = 1;
            i5 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == r42) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i5) {
                if (eventType != 3) {
                    xmlResourceParser2 = xmlResourceParser;
                    z2 = r42;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r42;
                        z11 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            c3627h.f41205b = 0;
                            c3627h.f41206c = 0;
                            c3627h.f41207d = 0;
                            c3627h.f41208e = 0;
                            c3627h.f41209f = r42;
                            c3627h.f41210g = r42;
                        } else if (name2.equals("item")) {
                            if (!c3627h.f41211h) {
                                n nVar = c3627h.f41228z;
                                if (nVar == null || !nVar.f43094b.hasSubMenu()) {
                                    c3627h.f41211h = r42;
                                    c3627h.b(c3627h.f41204a.add(c3627h.f41205b, c3627h.f41212i, c3627h.f41213j, c3627h.k));
                                } else {
                                    c3627h.f41211h = r42;
                                    c3627h.b(c3627h.f41204a.addSubMenu(c3627h.f41205b, c3627h.f41212i, c3627h.f41213j, c3627h.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = r42;
                            z10 = z2;
                        }
                        xmlResourceParser2 = xmlResourceParser;
                        z2 = r42;
                    }
                }
                eventType = xmlResourceParser2.next();
                r42 = z2;
                i5 = 2;
                z11 = z11;
            } else {
                if (!z11) {
                    String name3 = xmlResourceParser.getName();
                    boolean zEquals = name3.equals("group");
                    C3628i c3628i = c3627h.f41203E;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = c3628i.f41233c.obtainStyledAttributes(attributeSet, AbstractC2820a.f36452p);
                        c3627h.f41205b = typedArrayObtainStyledAttributes.getResourceId(r42, 0);
                        c3627h.f41206c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        c3627h.f41207d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        c3627h.f41208e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        c3627h.f41209f = typedArrayObtainStyledAttributes.getBoolean(2, r42);
                        c3627h.f41210g = typedArrayObtainStyledAttributes.getBoolean(0, r42);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            Context context = c3628i.f41233c;
                            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC2820a.f36453q);
                            c3627h.f41212i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                            c3627h.f41213j = (typedArrayObtainStyledAttributes2.getInt(5, c3627h.f41206c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, c3627h.f41207d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                            c3627h.k = typedArrayObtainStyledAttributes2.getText(7);
                            c3627h.f41214l = typedArrayObtainStyledAttributes2.getText(8);
                            c3627h.f41215m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                            String string = typedArrayObtainStyledAttributes2.getString(9);
                            c3627h.f41216n = string == null ? (char) 0 : string.charAt(0);
                            c3627h.f41217o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                            String string2 = typedArrayObtainStyledAttributes2.getString(10);
                            c3627h.f41218p = string2 == null ? (char) 0 : string2.charAt(0);
                            c3627h.f41219q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                            if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                                c3627h.f41220r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                            } else {
                                c3627h.f41220r = c3627h.f41208e;
                            }
                            c3627h.f41221s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                            c3627h.f41222t = typedArrayObtainStyledAttributes2.getBoolean(4, c3627h.f41209f);
                            c3627h.f41223u = typedArrayObtainStyledAttributes2.getBoolean(1, c3627h.f41210g);
                            c3627h.f41224v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                            c3627h.f41227y = typedArrayObtainStyledAttributes2.getString(12);
                            c3627h.f41225w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                            c3627h.f41226x = typedArrayObtainStyledAttributes2.getString(15);
                            String string3 = typedArrayObtainStyledAttributes2.getString(14);
                            boolean z12 = string3 != null;
                            if (z12 && c3627h.f41225w == 0 && c3627h.f41226x == null) {
                                c3627h.f41228z = (n) c3627h.a(string3, f41230f, c3628i.f41232b);
                            } else {
                                if (z12) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                c3627h.f41228z = null;
                            }
                            c3627h.f41199A = typedArrayObtainStyledAttributes2.getText(17);
                            c3627h.f41200B = typedArrayObtainStyledAttributes2.getText(22);
                            if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                                c3627h.f41202D = AbstractC3827n0.c(typedArrayObtainStyledAttributes2.getInt(19, -1), c3627h.f41202D);
                            } else {
                                c3627h.f41202D = null;
                            }
                            if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                                if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = Y0.e.getColorStateList(context, resourceId)) == null) {
                                    colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                                }
                                c3627h.f41201C = colorStateList;
                            } else {
                                c3627h.f41201C = null;
                            }
                            typedArrayObtainStyledAttributes2.recycle();
                            c3627h.f41211h = false;
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                        } else if (name3.equals("menu")) {
                            z2 = true;
                            c3627h.f41211h = true;
                            SubMenu subMenuAddSubMenu = c3627h.f41204a.addSubMenu(c3627h.f41205b, c3627h.f41212i, c3627h.f41213j, c3627h.k);
                            c3627h.b(subMenuAddSubMenu.getItem());
                            xmlResourceParser2 = xmlResourceParser;
                            b(xmlResourceParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlResourceParser2 = xmlResourceParser;
                            z2 = true;
                            str = name3;
                            z11 = true;
                        }
                        eventType = xmlResourceParser2.next();
                        r42 = z2;
                        i5 = 2;
                        z11 = z11;
                    }
                }
                xmlResourceParser2 = xmlResourceParser;
                z2 = r42;
            }
            eventType = xmlResourceParser2.next();
            r42 = z2;
            i5 = 2;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i5, Menu menu) {
        if (!(menu instanceof p.k)) {
            super.inflate(i5, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f41233c.getResources().getLayout(i5);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e7) {
                    throw new InflateException("Error inflating menu XML", e7);
                }
            } catch (XmlPullParserException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
