package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.XmlResourceParser;
import android.support.v7.view.menu.q;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class i extends MenuInflater {

    /* renamed from: a, reason: collision with root package name */
    static final Class[] f697a;

    /* renamed from: b, reason: collision with root package name */
    static final Class[] f698b;

    /* renamed from: c, reason: collision with root package name */
    final Object[] f699c;

    /* renamed from: d, reason: collision with root package name */
    final Object[] f700d;

    /* renamed from: e, reason: collision with root package name */
    final Context f701e;

    /* renamed from: f, reason: collision with root package name */
    private Object f702f;

    static {
        Class[] clsArr = {Context.class};
        f697a = clsArr;
        f698b = clsArr;
    }

    public i(Context context) {
        super(context);
        this.f701e = context;
        Object[] objArr = {context};
        this.f699c = objArr;
        this.f700d = objArr;
    }

    private final Object b(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? b(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        h hVar = new h(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == 2) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    if (name2.equals("group")) {
                        hVar.c(attributeSet);
                    } else if (name2.equals("item")) {
                        hVar.d(attributeSet);
                    } else if (name2.equals("menu")) {
                        c(xmlPullParser, attributeSet, hVar.a());
                    } else {
                        str = name2;
                    }
                    z2 = false;
                }
                z2 = true;
            } else if (eventType == 3) {
                String name3 = xmlPullParser.getName();
                if (!z2) {
                    z2 = false;
                } else if (name3.equals(str)) {
                    str = null;
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (name3.equals("group")) {
                    hVar.e();
                } else if (name3.equals("item")) {
                    if (!hVar.f()) {
                        ActionProvider actionProvider = hVar.f685a;
                        if (actionProvider == null || !actionProvider.hasSubMenu()) {
                            hVar.b();
                        } else {
                            hVar.a();
                        }
                    }
                } else if (name3.equals("menu")) {
                    z = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    final Object a() {
        Object obj = this.f702f;
        if (obj != null) {
            return obj;
        }
        Object objB = b(this.f701e);
        this.f702f = objB;
        return objB;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i2, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f701e.getResources().getLayout(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof q) {
                    q qVar = (q) menu;
                    if (qVar.B()) {
                        qVar.x();
                        z = true;
                    }
                }
                c(layout, attributeSetAsAttributeSet, menu);
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } finally {
            if (z) {
                ((q) menu).w();
            }
            if (layout != null) {
                layout.close();
            }
        }
    }
}
