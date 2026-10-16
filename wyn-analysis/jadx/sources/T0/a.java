package T0;

import A.AbstractC0213f;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11133a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f11134b;

    /* renamed from: c, reason: collision with root package name */
    public int f11135c;

    /* renamed from: d, reason: collision with root package name */
    public float f11136d;

    /* renamed from: e, reason: collision with root package name */
    public String f11137e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11138f;

    /* renamed from: g, reason: collision with root package name */
    public int f11139g;

    public a(a aVar, Object obj) {
        aVar.getClass();
        this.f11134b = aVar.f11134b;
        b(obj);
    }

    public static void a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f11347d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i5 = 0;
        boolean z2 = false;
        Object objValueOf = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i5 = 6;
            } else {
                int i12 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i12 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        } else {
                            i12 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i5 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i11 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i5 = i11;
                            }
                        }
                        i5 = 7;
                    }
                }
                i5 = i12;
            }
        }
        if (string != null && objValueOf != null) {
            a aVar = new a();
            aVar.f11134b = i5;
            aVar.f11133a = z2;
            aVar.b(objValueOf);
            map.put(string, aVar);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void b(Object obj) {
        switch (AbstractC0213f.f(this.f11134b)) {
            case 0:
            case 7:
                this.f11135c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f11136d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f11139g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f11137e = (String) obj;
                break;
            case 5:
                this.f11138f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f11136d = ((Float) obj).floatValue();
                break;
        }
    }
}
