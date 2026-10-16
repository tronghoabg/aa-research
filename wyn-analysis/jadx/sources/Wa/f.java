package Wa;

import Bf.k;
import Bf.r;
import Ef.E;
import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import ef.C2515C;
import ff.o;
import ff.v;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import org.apache.tika.metadata.TikaCoreProperties;
import r7.AbstractC3935e;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f15441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15442b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f15443c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15446f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Intent intent, b bVar, Activity activity, int i5, boolean z2, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f15441a = intent;
        this.f15442b = bVar;
        this.f15443c = activity;
        this.f15444d = i5;
        this.f15445e = z2;
        this.f15446f = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f15441a, this.f15442b, this.f15443c, this.f15444d, this.f15445e, this.f15446f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        f fVar = (f) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        fVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strSubstring;
        List listC;
        String separator;
        String strConcat;
        List listC2;
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C2515C c2515c = C2515C.f34653a;
        b bVar = this.f15442b;
        Intent intent = this.f15441a;
        if (intent == null) {
            bVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
            return c2515c;
        }
        ArrayList arrayList = new ArrayList();
        ClipData clipData = intent.getClipData();
        int i5 = this.f15444d;
        boolean z2 = this.f15445e;
        Activity con = this.f15443c;
        if (clipData != null) {
            ClipData clipData2 = intent.getClipData();
            AbstractC3340k.b(clipData2);
            int itemCount = clipData2.getItemCount();
            for (int i10 = 0; i10 < itemCount; i10++) {
                ClipData clipData3 = intent.getClipData();
                AbstractC3340k.b(clipData3);
                Uri uri = clipData3.getItemAt(i10).getUri();
                AbstractC3340k.b(uri);
                g.a(con, g.b(con, uri, i5), z2, arrayList);
            }
            bVar.c(arrayList);
            return c2515c;
        }
        if (intent.getData() == null) {
            Bundle extras = intent.getExtras();
            if (extras == null || !extras.containsKey("selectedItems")) {
                bVar.b("unknown_activity", "Unknown activity error, please fill an issue.");
                return c2515c;
            }
            Bundle extras2 = intent.getExtras();
            AbstractC3340k.b(extras2);
            ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? extras2.getParcelableArrayList("selectedItems", Parcelable.class) : extras2.getParcelableArrayList("selectedItems");
            if (parcelableArrayList != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : parcelableArrayList) {
                    if (obj2 instanceof Uri) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    g.a(con, (Uri) it.next(), z2, arrayList);
                }
            }
            bVar.c(arrayList);
            return c2515c;
        }
        Uri data = intent.getData();
        AbstractC3340k.b(data);
        Uri uriB = g.b(con, data, i5);
        if (!this.f15446f.equals("dir")) {
            g.a(con, uriB, z2, arrayList);
            if (arrayList.isEmpty()) {
                bVar.b("unknown_path", "Failed to retrieve path.");
                return c2515c;
            }
            bVar.c(arrayList);
            return c2515c;
        }
        Uri uriBuildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uriB, DocumentsContract.getTreeDocumentId(uriB));
        AbstractC3340k.d(uriBuildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
        AbstractC3340k.e(con, "con");
        int i11 = Build.VERSION.SDK_INT;
        Collection collectionN0 = v.f35432a;
        if (i11 >= 30 || !AbstractC3340k.a(uriBuildDocumentUriUsingTree.getAuthority(), "com.android.providers.downloads.documents")) {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
            AbstractC3340k.b(treeDocumentId);
            List listI0 = k.I0(treeDocumentId, new String[]{TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER});
            if (listI0.size() > 1) {
                String str = (String) listI0.get(0);
                String str2 = (String) listI0.get(1);
                strSubstring = "primary".equalsIgnoreCase(str) ? Environment.getExternalStorageDirectory() + '/' + str2 : "/storage/" + str + '/' + str2;
            } else {
                strSubstring = Environment.getExternalStorageDirectory() + '/' + ((String) o.y0(listI0));
            }
            String separator2 = File.separator;
            AbstractC3340k.d(separator2, "separator");
            if (r.b0(strSubstring, separator2, false)) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
                AbstractC3340k.d(strSubstring, "substring(...)");
            }
            String treeDocumentId2 = DocumentsContract.getTreeDocumentId(uriBuildDocumentUriUsingTree);
            AbstractC3340k.b(treeDocumentId2);
            Pattern patternCompile = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
            AbstractC3340k.d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(treeDocumentId2);
            if (matcher.find()) {
                ArrayList arrayList3 = new ArrayList(10);
                int iEnd = 0;
                do {
                    arrayList3.add(treeDocumentId2.subSequence(iEnd, matcher.start()).toString());
                    iEnd = matcher.end();
                } while (matcher.find());
                arrayList3.add(treeDocumentId2.subSequence(iEnd, treeDocumentId2.length()).toString());
                listC = arrayList3;
            } else {
                listC = AbstractC3935e.C(treeDocumentId2.toString());
            }
            if (!listC.isEmpty()) {
                ListIterator listIterator = listC.listIterator(listC.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionN0 = o.N0(listC, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            String[] strArr = (String[]) collectionN0.toArray(new String[0]);
            if (strArr.length >= 2) {
                separator = strArr[1];
            } else {
                separator = File.separator;
                AbstractC3340k.d(separator, "separator");
            }
            String separator3 = File.separator;
            AbstractC3340k.d(separator3, "separator");
            if (r.b0(separator, separator3, false)) {
                separator = separator.substring(0, separator.length() - 1);
                AbstractC3340k.d(separator, "substring(...)");
            }
            strConcat = (separator.length() <= 0 || r.b0(strSubstring, separator, false)) ? strSubstring : r.k0(separator, separator3, false) ? strSubstring.concat(separator) : N0.a.g(strSubstring, separator3, separator);
        } else {
            String documentId = DocumentsContract.getDocumentId(uriBuildDocumentUriUsingTree);
            strConcat = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
            if (!AbstractC3340k.a(documentId, "downloads")) {
                AbstractC3340k.b(documentId);
                Pattern patternCompile2 = Pattern.compile("^ms[df]:.*");
                AbstractC3340k.d(patternCompile2, "compile(...)");
                if (patternCompile2.matcher(documentId).matches()) {
                    strConcat = strConcat + '/' + g.f(con, uriBuildDocumentUriUsingTree);
                } else if (r.k0(documentId, "raw:", false)) {
                    Pattern patternCompile3 = Pattern.compile(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    AbstractC3340k.d(patternCompile3, "compile(...)");
                    Matcher matcher2 = patternCompile3.matcher(documentId);
                    if (matcher2.find()) {
                        ArrayList arrayList4 = new ArrayList(10);
                        int iEnd2 = 0;
                        do {
                            arrayList4.add(documentId.subSequence(iEnd2, matcher2.start()).toString());
                            iEnd2 = matcher2.end();
                        } while (matcher2.find());
                        arrayList4.add(documentId.subSequence(iEnd2, documentId.length()).toString());
                        listC2 = arrayList4;
                    } else {
                        listC2 = AbstractC3935e.C(documentId.toString());
                    }
                    if (!listC2.isEmpty()) {
                        ListIterator listIterator2 = listC2.listIterator(listC2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                collectionN0 = o.N0(listC2, listIterator2.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    strConcat = ((String[]) collectionN0.toArray(new String[0]))[1];
                } else {
                    strConcat = null;
                }
            }
        }
        if (strConcat != null) {
            bVar.c(strConcat);
            return c2515c;
        }
        bVar.b("unknown_path", "Failed to retrieve directory path.");
        return c2515c;
    }
}
