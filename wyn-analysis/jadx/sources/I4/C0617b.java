package I4;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: I4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5325a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5326b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5327c;

    public /* synthetic */ C0617b(int i5, Object obj, Object obj2) {
        this.f5325a = i5;
        this.f5326b = obj;
        this.f5327c = obj2;
    }

    @Override // I4.p
    public final boolean a(Object obj) {
        switch (this.f5325a) {
            case 0:
                Uri uri = (Uri) obj;
                return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
            case 1:
                Iterator it = ((ArrayList) this.f5326b).iterator();
                while (it.hasNext()) {
                    if (((p) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [I4.a, java.lang.Object] */
    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        o oVarB;
        Uri uri;
        switch (this.f5325a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new o(new X4.b(uri2), this.f5327c.k((AssetManager) this.f5326b, uri2.toString().substring(22)));
            case 1:
                ArrayList arrayList = (ArrayList) this.f5326b;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                B4.d dVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    p pVar = (p) arrayList.get(i11);
                    if (pVar.a(obj) && (oVarB = pVar.b(obj, i5, i10, gVar)) != null) {
                        arrayList2.add(oVarB.f5355c);
                        dVar = oVarB.f5353a;
                    }
                }
                if (arrayList2.isEmpty() || dVar == null) {
                    return null;
                }
                return new o(dVar, new t(arrayList2, (Dd.c) this.f5327c));
            default:
                Integer num = (Integer) obj;
                Resources resources = (Resources) this.f5327c;
                try {
                    uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e7) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e7);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((p) this.f5326b).b(uri, i5, i10, gVar);
        }
    }

    public String toString() {
        switch (this.f5325a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.f5326b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0617b(Resources resources, p pVar) {
        this.f5325a = 2;
        this.f5327c = resources;
        this.f5326b = pVar;
    }
}
