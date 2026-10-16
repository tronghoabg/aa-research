package androidx.core.text.util;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.core.text.util.LinkifyCompat;
import j$.net.URLEncoder;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class LinkifyCompat {
    private static final String[] EMPTY_STRING = new String[0];
    private static final Comparator<LinkSpec> COMPARATOR = new Comparator() { // from class: androidx.core.text.util.LinkifyCompat$$ExternalSyntheticLambda0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LinkifyCompat.lambda$static$0((LinkifyCompat.LinkSpec) obj, (LinkifyCompat.LinkSpec) obj2);
        }
    };

    /* compiled from: WazeSource */
    class LinkSpec {
        int end;
        URLSpan frameworkAddedSpan;
        int start;
        String url;

        LinkSpec() {
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinkifyMask {
    }

    private LinkifyCompat() {
    }

    private static void addLinkMovementMethod(TextView textView) {
        if ((textView.getMovementMethod() instanceof LinkMovementMethod) || !textView.getLinksClickable()) {
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public static boolean addLinks(Spannable spannable, int i2) {
        return Linkify.addLinks(spannable, i2);
    }

    private static void applyLink(String str, int i2, int i3, Spannable spannable) {
        spannable.setSpan(new URLSpan(str), i2, i3, 33);
    }

    private static String findAddress(String str) {
        return WebView.findAddress(str);
    }

    private static void gatherLinks(ArrayList<LinkSpec> arrayList, Spannable spannable, Pattern pattern, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Matcher matcher = pattern.matcher(spannable);
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            String strGroup = matcher.group(0);
            if (matchFilter == null || matchFilter.acceptMatch(spannable, iStart, iEnd)) {
                if (strGroup != null) {
                    LinkSpec linkSpec = new LinkSpec();
                    linkSpec.url = makeUrl(strGroup, strArr, matcher, transformFilter);
                    linkSpec.start = iStart;
                    linkSpec.end = iEnd;
                    arrayList.add(linkSpec);
                }
            }
        }
    }

    private static void gatherMapLinks(ArrayList<LinkSpec> arrayList, Spannable spannable) {
        int iIndexOf;
        String string = spannable.toString();
        int i2 = 0;
        while (true) {
            try {
                String strFindAddress = findAddress(string);
                if (strFindAddress == null || (iIndexOf = string.indexOf(strFindAddress)) < 0) {
                    return;
                }
                LinkSpec linkSpec = new LinkSpec();
                int length = strFindAddress.length() + iIndexOf;
                linkSpec.start = iIndexOf + i2;
                i2 += length;
                linkSpec.end = i2;
                string = string.substring(length);
                try {
                    linkSpec.url = "geo:0,0?q=" + URLEncoder.encode(strFindAddress, "UTF-8");
                    arrayList.add(linkSpec);
                } catch (UnsupportedEncodingException unused) {
                }
            } catch (UnsupportedOperationException unused2) {
                return;
            }
        }
    }

    static /* synthetic */ int lambda$static$0(LinkSpec linkSpec, LinkSpec linkSpec2) {
        int i2 = linkSpec.start;
        int i3 = linkSpec2.start;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        return Integer.compare(linkSpec2.end, linkSpec.end);
    }

    private static String makeUrl(String str, String[] strArr, Matcher matcher, Linkify.TransformFilter transformFilter) {
        boolean z;
        if (transformFilter != null) {
            str = transformFilter.transformUrl(matcher, str);
        }
        String strConcat = str;
        int length = strArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            String str2 = strArr[i2];
            if (strConcat.regionMatches(true, 0, str2, 0, str2.length())) {
                z = true;
                if (!strConcat.regionMatches(false, 0, str2, 0, str2.length())) {
                    strConcat = String.valueOf(str2).concat(String.valueOf(strConcat.substring(str2.length())));
                }
            } else {
                i2++;
            }
        }
        return (z || strArr.length <= 0) ? strConcat : String.valueOf(strArr[0]).concat(String.valueOf(strConcat));
    }

    private static void pruneOverlaps(ArrayList<LinkSpec> arrayList, Spannable spannable) {
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        for (URLSpan uRLSpan : (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class)) {
            LinkSpec linkSpec = new LinkSpec();
            linkSpec.frameworkAddedSpan = uRLSpan;
            linkSpec.start = spannable.getSpanStart(uRLSpan);
            linkSpec.end = spannable.getSpanEnd(uRLSpan);
            arrayList.add(linkSpec);
        }
        Collections.sort(arrayList, COMPARATOR);
        int size = arrayList.size();
        while (true) {
            int i6 = size - 1;
            if (i5 >= i6) {
                return;
            }
            LinkSpec linkSpec2 = arrayList.get(i5);
            int i7 = i5 + 1;
            LinkSpec linkSpec3 = arrayList.get(i7);
            int i8 = linkSpec2.start;
            int i9 = linkSpec3.start;
            if (i8 <= i9 && (i2 = linkSpec2.end) > i9) {
                int i10 = linkSpec3.end;
                int i11 = (i10 > i2 && (i3 = i2 - i8) <= (i4 = i10 - i9)) ? i3 < i4 ? i5 : -1 : i7;
                if (i11 != -1) {
                    Object obj = arrayList.get(i11).frameworkAddedSpan;
                    if (obj != null) {
                        spannable.removeSpan(obj);
                    }
                    arrayList.remove(i11);
                    size = i6;
                }
            }
            i5 = i7;
        }
    }

    private static boolean shouldAddLinksFallbackToFramework() {
        return true;
    }

    /* compiled from: WazeSource */
    class Api24Impl {
        private Api24Impl() {
        }

        static boolean addLinks(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            return Linkify.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
        }

        static void addLinks(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
            Linkify.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
        }
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str) {
        return Linkify.addLinks(spannable, pattern, str);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        return Linkify.addLinks(spannable, pattern, str, matchFilter, transformFilter);
    }

    public static boolean addLinks(Spannable spannable, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        return Api24Impl.addLinks(spannable, pattern, str, strArr, matchFilter, transformFilter);
    }

    public static boolean addLinks(TextView textView, int i2) {
        return Linkify.addLinks(textView, i2);
    }

    public static void addLinks(TextView textView, Pattern pattern, String str) {
        Linkify.addLinks(textView, pattern, str);
    }

    public static void addLinks(TextView textView, Pattern pattern, String str, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Linkify.addLinks(textView, pattern, str, matchFilter, transformFilter);
    }

    public static void addLinks(TextView textView, Pattern pattern, String str, String[] strArr, Linkify.MatchFilter matchFilter, Linkify.TransformFilter transformFilter) {
        Api24Impl.addLinks(textView, pattern, str, strArr, matchFilter, transformFilter);
    }
}
