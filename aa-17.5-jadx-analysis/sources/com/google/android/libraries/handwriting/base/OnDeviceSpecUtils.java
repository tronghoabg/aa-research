package com.google.android.libraries.handwriting.base;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import com.google.android.libraries.handwriting.base.HandwritingRecognizer;
import defpackage.a;
import defpackage.abnj;
import defpackage.abnp;
import defpackage.abnv;
import defpackage.aboh;
import defpackage.abwv;
import defpackage.abww;
import defpackage.abwx;
import defpackage.abwy;
import defpackage.abwz;
import defpackage.abxa;
import defpackage.abxb;
import defpackage.abxc;
import defpackage.abxd;
import defpackage.abxe;
import defpackage.abxf;
import defpackage.sk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class OnDeviceSpecUtils {
    private static final String TAG = "HWROnDeviceSpecUtils";

    /* JADX WARN: Multi-variable type inference failed */
    public static void adjustSpecsForAssets(abwx abwxVar, AssetManager assetManager) {
        try {
            Log.i(TAG, "Assets: " + Arrays.toString(assetManager.list("")));
            HashSet hashSet = new HashSet(Arrays.asList(assetManager.list("")));
            for (int i = 0; i < ((abwy) abwxVar.b).b.size(); i++) {
                abwv abwvVar = (abwv) ((abww) ((abwy) abwxVar.b).b.get(i)).K();
                modifySpecForAssets(hashSet, abwvVar);
                abww abwwVarQ = abwvVar.q();
                abwxVar.t();
                abwy abwyVar = (abwy) abwxVar.b;
                abwwVarQ.getClass();
                aboh abohVar = abwyVar.b;
                if (!abohVar.c()) {
                    abwyVar.b = abnv.I(abohVar);
                }
                abwyVar.b.set(i, abwwVarQ);
            }
        } catch (IOException e) {
            Log.i(TAG, "error adjusting specs", e);
        }
    }

    public static boolean canDoOnDevice(abww abwwVar) {
        int i = abwwVar.b;
        if ((i & 2048) != 0) {
            abwz abwzVar = abwwVar.l;
            if (abwzVar == null) {
                abwzVar = abwz.a;
            }
            return (abwzVar.b & 1) != 0;
        }
        int i2 = i & 128;
        if (i2 == 0 && !((i & 256) == 0 && (i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 && (i & 4096) == 0)) {
            return true;
        }
        if (i2 != 0 && (i & 256) == 0 && (i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 && (i & 4096) == 0) {
            return false;
        }
        Log.e(TAG, "There is a certain confusion about this spec");
        return false;
    }

    public static void deleteFilesFromSpec(Context context, abww abwwVar) {
        ArrayList<String> filesFromSpec = getFilesFromSpec(abwwVar);
        int size = filesFromSpec.size();
        for (int i = 0; i < size; i++) {
            context.deleteFile(new File(Util.maybeMakeFilenameFromUrl(context, filesFromSpec.get(i))).getName());
        }
    }

    public static long getDownloadSize(Context context, ArrayList<String> arrayList, String[] strArr, int[] iArr) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            String str = arrayList.get(i);
            if (new File(Util.maybeMakeFilenameFromUrl(context, str)).exists()) {
                Log.i(TAG, "File exists already. Not counting.");
            } else {
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (strArr[i2].contentEquals(str)) {
                        j += iArr[i2];
                    }
                }
            }
        }
        return j;
    }

    public static String getDownloadSizeInMB(long j) {
        return String.format(Locale.ROOT, "%3.1f", Float.valueOf((j / 1024.0f) / 1024.0f));
    }

    public static ArrayList<String> getFilesFromSpec(abww abwwVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (abwwVar != null) {
            if ((abwwVar.b & 256) != 0) {
                abxc abxcVar = abwwVar.i;
                if (abxcVar == null) {
                    abxcVar = abxc.a;
                }
                arrayList.addAll(getSingleCharRecognizerFiles(abxcVar));
            }
            if ((abwwVar.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
                abxf abxfVar = abwwVar.j;
                if (abxfVar == null) {
                    abxfVar = abxf.a;
                }
                arrayList.addAll(getWordRecognizerFiles(abxfVar));
            }
            if ((abwwVar.b & 4096) != 0) {
                abxa abxaVar = abwwVar.m;
                if (abxaVar == null) {
                    abxaVar = abxa.a;
                }
                arrayList.addAll(getLstmOndeviceSpecFiles(abxaVar));
            }
            if ((abwwVar.b & 1024) != 0) {
                abww abwwVar2 = abwwVar.k;
                if (abwwVar2 == null) {
                    abwwVar2 = abww.a;
                }
                arrayList.addAll(getFilesFromSpec(abwwVar2));
            }
            if ((abwwVar.b & 2048) != 0) {
                abwz abwzVar = abwwVar.l;
                if (abwzVar == null) {
                    abwzVar = abwz.a;
                }
                abww abwwVar3 = abwzVar.c;
                if (abwwVar3 == null) {
                    abwwVar3 = abww.a;
                }
                arrayList.addAll(getFilesFromSpec(abwwVar3));
            }
        }
        return arrayList;
    }

    public static int getIndexOfSpecForLanguage(abwy abwyVar, String str) {
        String strSubstring;
        if (abwyVar == null || str == null) {
            return -1;
        }
        int indexOfSpecForLanguageExact = getIndexOfSpecForLanguageExact(abwyVar, str);
        if (indexOfSpecForLanguageExact != -1) {
            return indexOfSpecForLanguageExact;
        }
        Log.e(TAG, "No exact match for language ".concat(str));
        int iIndexOf = str.indexOf(95);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(45);
        }
        if (iIndexOf != -1) {
            strSubstring = str.substring(0, iIndexOf);
            int indexOfSpecForLanguageExact2 = getIndexOfSpecForLanguageExact(abwyVar, strSubstring);
            if (indexOfSpecForLanguageExact2 != -1) {
                return indexOfSpecForLanguageExact2;
            }
        } else {
            strSubstring = str;
        }
        Log.e(TAG, a.bM(strSubstring, str, "No match for language ", " "));
        if (strSubstring.equals("no") || strSubstring.equals("nn")) {
            return getIndexOfSpecForLanguageExact(abwyVar, "nb");
        }
        if (strSubstring.equals("id")) {
            return getIndexOfSpecForLanguageExact(abwyVar, "in");
        }
        if (strSubstring.equals("tl")) {
            return getIndexOfSpecForLanguageExact(abwyVar, "fil");
        }
        Log.e(TAG, a.bq(str, "Spec for language ", " not found."));
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int getIndexOfSpecForLanguageExact(abwy abwyVar, String str) {
        if (abwyVar != null && str != null) {
            Log.i(TAG, "getSpecForLanguageExact: ".concat(str));
            for (int i = 0; i < abwyVar.b.size(); i++) {
                if (str.equals(((abww) abwyVar.b.get(i)).c)) {
                    Log.i(TAG, "i = " + i + ": " + ((abww) abwyVar.b.get(i)).c);
                    return i;
                }
            }
            Log.e(TAG, "No spec for language ".concat(str));
        }
        return -1;
    }

    public static ArrayList<String> getLstmOndeviceSpecFiles(abxa abxaVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        if ((abxaVar.b & 1) != 0) {
            arrayList.add(abxaVar.c);
        }
        if ((abxaVar.b & 2) != 0) {
            arrayList.add(abxaVar.d);
        }
        if ((abxaVar.b & 4) != 0) {
            arrayList.add(abxaVar.e);
        }
        return arrayList;
    }

    public static ArrayList<String> getSingleCharRecognizerFiles(abxc abxcVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        if ((abxcVar.b & 1) != 0) {
            arrayList.add(abxcVar.c);
        }
        if ((abxcVar.b & 2) != 0) {
            arrayList.add(abxcVar.d);
        }
        if ((abxcVar.b & 16) != 0) {
            arrayList.add(abxcVar.e);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static abww getSpecForLanguage(abwy abwyVar, String str) {
        int indexOfSpecForLanguage = getIndexOfSpecForLanguage(abwyVar, str);
        if (indexOfSpecForLanguage >= 0) {
            return (abww) abwyVar.b.get(indexOfSpecForLanguage);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static abww getSpecForLanguageExact(abwy abwyVar, String str) {
        int indexOfSpecForLanguageExact = getIndexOfSpecForLanguageExact(abwyVar, str);
        if (indexOfSpecForLanguageExact >= 0) {
            return (abww) abwyVar.b.get(indexOfSpecForLanguageExact);
        }
        return null;
    }

    private static String getUrlBaseNameWithoutHash(String str) {
        if (!str.startsWith("http")) {
            return str;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        String str2 = ".zip";
        if (lastPathSegment.endsWith(".zip")) {
            lastPathSegment = lastPathSegment.substring(0, lastPathSegment.length() - 4);
        } else {
            str2 = "";
        }
        return String.valueOf(lastPathSegment.substring(0, lastPathSegment.length() - 9)).concat(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList<String> getWordRecognizerFiles(abxf abxfVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        if ((abxfVar.b & 1) != 0) {
            arrayList.add(abxfVar.c);
            for (int i = 0; i < abxfVar.d.size(); i++) {
                arrayList.add(((abxd) abxfVar.d.get(i)).c);
            }
        }
        return arrayList;
    }

    public static boolean haveAllFiles(Context context, abww abwwVar) {
        ArrayList<String> filesFromSpec = getFilesFromSpec(abwwVar);
        int size = filesFromSpec.size();
        int i = 0;
        while (i < size) {
            String str = filesFromSpec.get(i);
            i++;
            if (!Util.fileExistsOrCopiedFromAssets(context, str, Util.maybeMakeFilenameFromUrl(context, str))) {
                return false;
            }
        }
        return true;
    }

    private static String maybeRewriteUrlForAssets(String str, Set<String> set) {
        if (str == null) {
            return null;
        }
        String urlBaseNameWithoutHash = getUrlBaseNameWithoutHash(str);
        return set.contains(urlBaseNameWithoutHash) ? "assets://".concat(String.valueOf(urlBaseNameWithoutHash)) : str;
    }

    private static void modifySingleCharSpecForAssets(Set<String> set, abxb abxbVar) {
        String strMaybeRewriteUrlForAssets = maybeRewriteUrlForAssets(((abxc) abxbVar.b).c, set);
        abxbVar.t();
        abxc abxcVar = (abxc) abxbVar.b;
        strMaybeRewriteUrlForAssets.getClass();
        abxcVar.b |= 1;
        abxcVar.c = strMaybeRewriteUrlForAssets;
        String strMaybeRewriteUrlForAssets2 = maybeRewriteUrlForAssets(abxcVar.d, set);
        abxbVar.t();
        abxc abxcVar2 = (abxc) abxbVar.b;
        strMaybeRewriteUrlForAssets2.getClass();
        abxcVar2.b |= 2;
        abxcVar2.d = strMaybeRewriteUrlForAssets2;
        String strMaybeRewriteUrlForAssets3 = maybeRewriteUrlForAssets(abxcVar2.e, set);
        abxbVar.t();
        abxc abxcVar3 = (abxc) abxbVar.b;
        strMaybeRewriteUrlForAssets3.getClass();
        abxcVar3.b |= 16;
        abxcVar3.e = strMaybeRewriteUrlForAssets3;
    }

    private static void modifySpecForAssets(Set<String> set, abwv abwvVar) {
        abww abwwVar = (abww) abwvVar.b;
        if ((abwwVar.b & 256) != 0) {
            abxc abxcVar = abwwVar.i;
            if (abxcVar == null) {
                abxcVar = abxc.a;
            }
            abxb abxbVar = (abxb) abxcVar.K();
            modifySingleCharSpecForAssets(set, abxbVar);
            abxc abxcVarQ = abxbVar.q();
            abwvVar.t();
            abww abwwVar2 = (abww) abwvVar.b;
            abxcVarQ.getClass();
            abwwVar2.i = abxcVarQ;
            abwwVar2.b |= 256;
        }
        abww abwwVar3 = (abww) abwvVar.b;
        if ((abwwVar3.b & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0) {
            abxf abxfVar = abwwVar3.j;
            if (abxfVar == null) {
                abxfVar = abxf.a;
            }
            abxe abxeVar = (abxe) abxfVar.K();
            modifyWordRecoSpecForAssets(set, abxeVar);
            abxf abxfVarQ = abxeVar.q();
            abwvVar.t();
            abww abwwVar4 = (abww) abwvVar.b;
            abxfVarQ.getClass();
            abwwVar4.j = abxfVarQ;
            abwwVar4.b |= sk.AUDIO_CONTENT_BUFFER_SIZE;
        }
        abww abwwVar5 = (abww) abwvVar.b;
        if ((abwwVar5.b & 1024) != 0) {
            abww abwwVar6 = abwwVar5.k;
            if (abwwVar6 == null) {
                abwwVar6 = abww.a;
            }
            abwv abwvVar2 = (abwv) abwwVar6.K();
            modifySpecForAssets(set, abwvVar2);
            abww abwwVarQ = abwvVar2.q();
            abwvVar.t();
            abww abwwVar7 = (abww) abwvVar.b;
            abwwVarQ.getClass();
            abwwVar7.k = abwwVarQ;
            abwwVar7.b |= 1024;
        }
        abww abwwVar8 = (abww) abwvVar.b;
        if ((abwwVar8.b & 2048) != 0) {
            abwz abwzVar = abwwVar8.l;
            if (abwzVar == null) {
                abwzVar = abwz.a;
            }
            if ((abwzVar.b & 1) != 0) {
                abwz abwzVar2 = ((abww) abwvVar.b).l;
                if (abwzVar2 == null) {
                    abwzVar2 = abwz.a;
                }
                abnp abnpVarK = abwzVar2.K();
                abww abwwVar9 = ((abwz) abnpVarK.b).c;
                if (abwwVar9 == null) {
                    abwwVar9 = abww.a;
                }
                abwv abwvVar3 = (abwv) abwwVar9.K();
                modifySpecForAssets(set, abwvVar3);
                abww abwwVarQ2 = abwvVar3.q();
                abnpVarK.t();
                abwz abwzVar3 = (abwz) abnpVarK.b;
                abwwVarQ2.getClass();
                abwzVar3.c = abwwVarQ2;
                abwzVar3.b |= 1;
                abwz abwzVar4 = (abwz) abnpVarK.q();
                abwvVar.t();
                abww abwwVar10 = (abww) abwvVar.b;
                abwzVar4.getClass();
                abwwVar10.l = abwzVar4;
                abwwVar10.b |= 2048;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void modifyWordRecoSpecForAssets(Set<String> set, abxe abxeVar) {
        String strMaybeRewriteUrlForAssets = maybeRewriteUrlForAssets(((abxf) abxeVar.b).c, set);
        abxeVar.t();
        abxf abxfVar = (abxf) abxeVar.b;
        strMaybeRewriteUrlForAssets.getClass();
        abxfVar.b |= 1;
        abxfVar.c = strMaybeRewriteUrlForAssets;
        for (int i = 0; i < ((abxf) abxeVar.b).d.size(); i++) {
            abnp abnpVarK = ((abxd) ((abxf) abxeVar.b).d.get(i)).K();
            String strMaybeRewriteUrlForAssets2 = maybeRewriteUrlForAssets(((abxd) abnpVarK.b).c, set);
            abnpVarK.t();
            abxd abxdVar = (abxd) abnpVarK.b;
            strMaybeRewriteUrlForAssets2.getClass();
            abxdVar.b |= 1;
            abxdVar.c = strMaybeRewriteUrlForAssets2;
            abxd abxdVar2 = (abxd) abnpVarK.q();
            abxeVar.t();
            abxf abxfVar2 = (abxf) abxeVar.b;
            abxdVar2.getClass();
            aboh abohVar = abxfVar2.d;
            if (!abohVar.c()) {
                abxfVar2.d = abnv.I(abohVar);
            }
            abxfVar2.d.set(i, abxdVar2);
        }
    }

    public static abwy readSubtypes(InputStream inputStream, AssetManager assetManager) {
        try {
            abwx abwxVar = (abwx) ((abwx) abwy.a.n()).h(Util.bytesFromStream(inputStream), abnj.a());
            Log.i(TAG, a.bn(((abwy) abwxVar.b).b.size(), "Found ", " subtypes"));
            if (assetManager != null) {
                adjustSpecsForAssets(abwxVar, assetManager);
            }
            return (abwy) abwxVar.q();
        } catch (IOException e) {
            Log.e(TAG, "Couldn't read subtypes: ", e);
            return null;
        }
    }

    public static void removeDownloadedFiles(Context context, TreeMap<String, ArrayList<String>> treeMap) {
        TreeMap treeMap2 = new TreeMap();
        for (Map.Entry<String, ArrayList<String>> entry : treeMap.entrySet()) {
            ArrayList<String> value = entry.getValue();
            int size = value.size();
            for (int i = 0; i < size; i++) {
                String str = value.get(i);
                if (!new File(Util.maybeMakeFilenameFromUrl(context, str)).exists()) {
                    if (!treeMap2.containsKey(entry.getKey())) {
                        treeMap2.put(entry.getKey(), new ArrayList());
                    }
                    ((ArrayList) treeMap2.get(entry.getKey())).add(str);
                }
            }
        }
        treeMap.clear();
        treeMap.putAll(treeMap2);
    }

    public static void setSettingsFromSpec(abww abwwVar, HandwritingRecognizer.HandwritingRecognizerSettings handwritingRecognizerSettings) {
        int i = abwwVar.b;
        if ((i & 1) != 0) {
            handwritingRecognizerSettings.language = abwwVar.c;
        }
        if ((i & 8) != 0) {
            handwritingRecognizerSettings.verbosity = abwwVar.e;
        }
        if ((i & 16) != 0) {
            handwritingRecognizerSettings.maxRequestsInParallel = abwwVar.f;
        }
        if ((i & 32) != 0) {
            handwritingRecognizerSettings.timeoutBeforeNextRequest = abwwVar.g;
        }
        if ((i & 64) != 0) {
            handwritingRecognizerSettings.useSpaces = abwwVar.h;
        }
        Log.i(TAG, "settings: ".concat(String.valueOf(String.valueOf(handwritingRecognizerSettings))));
    }

    public static long getDownloadSize(Context context, TreeMap<String, ArrayList<String>> treeMap, String[] strArr, int[] iArr) {
        Iterator<Map.Entry<String, ArrayList<String>>> it = treeMap.entrySet().iterator();
        long downloadSize = 0;
        while (it.hasNext()) {
            downloadSize += getDownloadSize(context, it.next().getValue(), strArr, iArr);
        }
        return downloadSize;
    }
}
