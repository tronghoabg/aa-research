package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class sze implements java.io.FilenameFilter {
    java.util.List a = new java.util.ArrayList();

    public sze(java.io.File file, java.util.List list) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.util.Log.i("FILE_DELETION", "Adding glob path: " + file.getAbsolutePath() + java.io.File.separator + str);
            java.lang.String strReplace = str.replace("*", ".*");
            this.a.add(new android.os.PatternMatcher(file.getAbsolutePath() + java.io.File.separator + strReplace, 2));
        }
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        java.lang.String str2 = file.getAbsolutePath() + java.io.File.separator + str;
        for (android.os.PatternMatcher patternMatcher : this.a) {
            if (patternMatcher.match(str2)) {
                android.util.Log.i("FILE_DELETION", java.lang.String.format("Deleting file '%s' which matches '%s'", str2, patternMatcher.getPath()));
                return true;
            }
        }
        return false;
    }
}
