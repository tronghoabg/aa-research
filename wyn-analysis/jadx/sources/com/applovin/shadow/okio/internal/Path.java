package com.applovin.shadow.okio.internal;

import R8.v;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Path;
import ff.o;
import ff.p;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0014\u001a\u0016\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003*\u00020\u0000H\u0080\b¢\u0006\u0004\b\b\u0010\u0006\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0014\u0010\u0010\u001a\u00020\u0007*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0014\u0010\u0012\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0014\u0010\u0002\u001a\u0013\u0010\u0015\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u000e\u001a\u0014\u0010\u0016\u001a\u00020\f*\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0016\u0010\u000e\u001a$\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a$\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001b\u001a$\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001d\u001a#\u0010\u0019\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001e\u001a\u001c\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b \u0010!\u001a\u0014\u0010\"\u001a\u00020\u0000*\u00020\u0000H\u0080\b¢\u0006\u0004\b\"\u0010\u0002\u001a\u001c\u0010#\u001a\u00020\t*\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u001e\u0010&\u001a\u00020\f*\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010%H\u0080\b¢\u0006\u0004\b&\u0010'\u001a\u0014\u0010(\u001a\u00020\t*\u00020\u0000H\u0080\b¢\u0006\u0004\b(\u0010\u000b\u001a\u0014\u0010)\u001a\u00020\u0004*\u00020\u0000H\u0080\b¢\u0006\u0004\b)\u0010\u0013\u001a\u001b\u0010*\u001a\u00020\u0000*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b*\u0010+\u001a\u001b\u0010,\u001a\u00020\u0000*\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b,\u0010-\u001a\u0013\u0010.\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u0010.\u001a\u00020\u0007*\u000200H\u0002¢\u0006\u0004\b.\u00101\u001a\u001b\u00103\u001a\u00020\f*\u00020\u001c2\u0006\u00102\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104\u001a\u0016\u00106\u001a\u0004\u0018\u000105*\u00020\u0000H\u0080\b¢\u0006\u0004\b6\u00107\"\u001a\u00108\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b8\u00109\u0012\u0004\b:\u0010;\"\u001a\u0010<\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b<\u00109\u0012\u0004\b=\u0010;\"\u001a\u0010>\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b>\u00109\u0012\u0004\b?\u0010;\"\u001a\u0010@\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\b@\u00109\u0012\u0004\bA\u0010;\"\u001a\u0010B\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\f\n\u0004\bB\u00109\u0012\u0004\bC\u0010;\"\u0018\u0010F\u001a\u00020\t*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u00102\u001a\u0004\u0018\u00010\u0007*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006I"}, d2 = {"Lcom/applovin/shadow/okio/Path;", "commonRoot", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "", "", "commonSegments", "(Lcom/applovin/shadow/okio/Path;)Ljava/util/List;", "Lcom/applovin/shadow/okio/ByteString;", "commonSegmentsBytes", "", "rootLength", "(Lcom/applovin/shadow/okio/Path;)I", "", "commonIsAbsolute", "(Lcom/applovin/shadow/okio/Path;)Z", "commonIsRelative", "commonNameBytes", "(Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/ByteString;", "commonName", "(Lcom/applovin/shadow/okio/Path;)Ljava/lang/String;", "commonParent", "lastSegmentIsDotDot", "commonIsRoot", "child", "normalize", "commonResolve", "(Lcom/applovin/shadow/okio/Path;Ljava/lang/String;Z)Lcom/applovin/shadow/okio/Path;", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/ByteString;Z)Lcom/applovin/shadow/okio/Path;", "Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Buffer;Z)Lcom/applovin/shadow/okio/Path;", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;Z)Lcom/applovin/shadow/okio/Path;", "other", "commonRelativeTo", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)Lcom/applovin/shadow/okio/Path;", "commonNormalized", "commonCompareTo", "(Lcom/applovin/shadow/okio/Path;Lcom/applovin/shadow/okio/Path;)I", "", "commonEquals", "(Lcom/applovin/shadow/okio/Path;Ljava/lang/Object;)Z", "commonHashCode", "commonToString", "commonToPath", "(Ljava/lang/String;Z)Lcom/applovin/shadow/okio/Path;", "toPath", "(Lcom/applovin/shadow/okio/Buffer;Z)Lcom/applovin/shadow/okio/Path;", "toSlash", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "", "(B)Lcom/applovin/shadow/okio/ByteString;", "slash", "startsWithVolumeLetterAndColon", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;)Z", "", "commonVolumeLetter", "(Lcg/y;)Ljava/lang/Character;", "SLASH", "Lcom/applovin/shadow/okio/ByteString;", "getSLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "ANY_SLASH", "getANY_SLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "getIndexOfLastSlash", "(Lcg/y;)I", "indexOfLastSlash", "getSlash", "(Lcg/y;)Lcg/j;", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-Path, reason: invalid class name */
/* loaded from: classes.dex */
public final class Path {

    @NotNull
    private static final ByteString ANY_SLASH;

    @NotNull
    private static final ByteString BACKSLASH;

    @NotNull
    private static final ByteString DOT;

    @NotNull
    private static final ByteString DOT_DOT;

    @NotNull
    private static final ByteString SLASH;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        SLASH = companion.encodeUtf8("/");
        BACKSLASH = companion.encodeUtf8("\\");
        ANY_SLASH = companion.encodeUtf8("/\\");
        DOT = companion.encodeUtf8(".");
        DOT_DOT = companion.encodeUtf8("..");
    }

    public static final int commonCompareTo(@NotNull com.applovin.shadow.okio.Path path, @NotNull com.applovin.shadow.okio.Path other) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(other, "other");
        return path.getBytes().compareTo(other.getBytes());
    }

    public static final boolean commonEquals(@NotNull com.applovin.shadow.okio.Path path, @Nullable Object obj) {
        AbstractC3340k.e(path, "<this>");
        return (obj instanceof com.applovin.shadow.okio.Path) && AbstractC3340k.a(((com.applovin.shadow.okio.Path) obj).getBytes(), path.getBytes());
    }

    public static final int commonHashCode(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return path.getBytes().hashCode();
    }

    public static final boolean commonIsAbsolute(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return rootLength(path) != -1;
    }

    public static final boolean commonIsRelative(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return rootLength(path) == -1;
    }

    public static final boolean commonIsRoot(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return rootLength(path) == path.getBytes().size();
    }

    @NotNull
    public static final String commonName(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return path.nameBytes().utf8();
    }

    @NotNull
    public static final ByteString commonNameBytes(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        int indexOfLastSlash = getIndexOfLastSlash(path);
        return indexOfLastSlash != -1 ? ByteString.substring$default(path.getBytes(), indexOfLastSlash + 1, 0, 2, null) : (path.volumeLetter() == null || path.getBytes().size() != 2) ? path.getBytes() : ByteString.EMPTY;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonNormalized(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return com.applovin.shadow.okio.Path.INSTANCE.get(path.toString(), true);
    }

    @Nullable
    public static final com.applovin.shadow.okio.Path commonParent(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        if (AbstractC3340k.a(path.getBytes(), DOT) || AbstractC3340k.a(path.getBytes(), SLASH) || AbstractC3340k.a(path.getBytes(), BACKSLASH) || lastSegmentIsDotDot(path)) {
            return null;
        }
        int indexOfLastSlash = getIndexOfLastSlash(path);
        if (indexOfLastSlash == 2 && path.volumeLetter() != null) {
            if (path.getBytes().size() == 3) {
                return null;
            }
            return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes(), 0, 3, 1, null));
        }
        if (indexOfLastSlash == 1 && path.getBytes().startsWith(BACKSLASH)) {
            return null;
        }
        if (indexOfLastSlash != -1 || path.volumeLetter() == null) {
            return indexOfLastSlash == -1 ? new com.applovin.shadow.okio.Path(DOT) : indexOfLastSlash == 0 ? new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes(), 0, 1, 1, null)) : new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes(), 0, indexOfLastSlash, 1, null));
        }
        if (path.getBytes().size() == 2) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(ByteString.substring$default(path.getBytes(), 0, 2, 1, null));
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonRelativeTo(@NotNull com.applovin.shadow.okio.Path path, @NotNull com.applovin.shadow.okio.Path other) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(other, "other");
        if (!AbstractC3340k.a(path.getRoot(), other.getRoot())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + path + " and " + other).toString());
        }
        List<ByteString> segmentsBytes = path.getSegmentsBytes();
        List<ByteString> segmentsBytes2 = other.getSegmentsBytes();
        int iMin = Math.min(segmentsBytes.size(), segmentsBytes2.size());
        int i5 = 0;
        while (i5 < iMin && AbstractC3340k.a(segmentsBytes.get(i5), segmentsBytes2.get(i5))) {
            i5++;
        }
        if (i5 == iMin && path.getBytes().size() == other.getBytes().size()) {
            return Path.Companion.get$default(com.applovin.shadow.okio.Path.INSTANCE, ".", false, 1, (Object) null);
        }
        if (segmentsBytes2.subList(i5, segmentsBytes2.size()).indexOf(DOT_DOT) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + path + " and " + other).toString());
        }
        Buffer buffer = new Buffer();
        ByteString slash = getSlash(other);
        if (slash == null && (slash = getSlash(path)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        int size = segmentsBytes2.size();
        for (int i10 = i5; i10 < size; i10++) {
            buffer.write(DOT_DOT);
            buffer.write(slash);
        }
        int size2 = segmentsBytes.size();
        while (i5 < size2) {
            buffer.write(segmentsBytes.get(i5));
            buffer.write(slash);
            i5++;
        }
        return toPath(buffer, false);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonResolve(@NotNull com.applovin.shadow.okio.Path path, @NotNull String child, boolean z2) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(child, "child");
        return commonResolve(path, toPath(new Buffer().writeUtf8(child), false), z2);
    }

    @Nullable
    public static final com.applovin.shadow.okio.Path commonRoot(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            return null;
        }
        return new com.applovin.shadow.okio.Path(path.getBytes().substring(0, iRootLength));
    }

    @NotNull
    public static final List<String> commonSegments(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i5 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i5, iRootLength));
                i5 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i5 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i5, path.getBytes().size()));
        }
        ArrayList arrayList2 = new ArrayList(p.a0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ByteString) it.next()).utf8());
        }
        return arrayList2;
    }

    @NotNull
    public static final List<ByteString> commonSegmentsBytes(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        ArrayList arrayList = new ArrayList();
        int iRootLength = rootLength(path);
        if (iRootLength == -1) {
            iRootLength = 0;
        } else if (iRootLength < path.getBytes().size() && path.getBytes().getByte(iRootLength) == 92) {
            iRootLength++;
        }
        int size = path.getBytes().size();
        int i5 = iRootLength;
        while (iRootLength < size) {
            if (path.getBytes().getByte(iRootLength) == 47 || path.getBytes().getByte(iRootLength) == 92) {
                arrayList.add(path.getBytes().substring(i5, iRootLength));
                i5 = iRootLength + 1;
            }
            iRootLength++;
        }
        if (i5 < path.getBytes().size()) {
            arrayList.add(path.getBytes().substring(i5, path.getBytes().size()));
        }
        return arrayList;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonToPath(@NotNull String str, boolean z2) {
        AbstractC3340k.e(str, "<this>");
        return toPath(new Buffer().writeUtf8(str), z2);
    }

    @NotNull
    public static final String commonToString(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        return path.getBytes().utf8();
    }

    @Nullable
    public static final Character commonVolumeLetter(@NotNull com.applovin.shadow.okio.Path path) {
        AbstractC3340k.e(path, "<this>");
        if (ByteString.indexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null) != -1 || path.getBytes().size() < 2 || path.getBytes().getByte(1) != 58) {
            return null;
        }
        char c10 = (char) path.getBytes().getByte(0);
        if (('a' > c10 || c10 >= '{') && ('A' > c10 || c10 >= '[')) {
            return null;
        }
        return Character.valueOf(c10);
    }

    private static /* synthetic */ void getANY_SLASH$annotations() {
    }

    private static /* synthetic */ void getBACKSLASH$annotations() {
    }

    private static /* synthetic */ void getDOT$annotations() {
    }

    private static /* synthetic */ void getDOT_DOT$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getIndexOfLastSlash(com.applovin.shadow.okio.Path path) {
        int iLastIndexOf$default = ByteString.lastIndexOf$default(path.getBytes(), SLASH, 0, 2, (Object) null);
        return iLastIndexOf$default != -1 ? iLastIndexOf$default : ByteString.lastIndexOf$default(path.getBytes(), BACKSLASH, 0, 2, (Object) null);
    }

    private static /* synthetic */ void getSLASH$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString getSlash(com.applovin.shadow.okio.Path path) {
        ByteString bytes = path.getBytes();
        ByteString byteString = SLASH;
        if (ByteString.indexOf$default(bytes, byteString, 0, 2, (Object) null) != -1) {
            return byteString;
        }
        ByteString bytes2 = path.getBytes();
        ByteString byteString2 = BACKSLASH;
        if (ByteString.indexOf$default(bytes2, byteString2, 0, 2, (Object) null) != -1) {
            return byteString2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lastSegmentIsDotDot(com.applovin.shadow.okio.Path path) {
        return path.getBytes().endsWith(DOT_DOT) && (path.getBytes().size() == 2 || path.getBytes().rangeEquals(path.getBytes().size() + (-3), SLASH, 0, 1) || path.getBytes().rangeEquals(path.getBytes().size() + (-3), BACKSLASH, 0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int rootLength(com.applovin.shadow.okio.Path path) {
        if (path.getBytes().size() == 0) {
            return -1;
        }
        if (path.getBytes().getByte(0) == 47) {
            return 1;
        }
        if (path.getBytes().getByte(0) == 92) {
            if (path.getBytes().size() <= 2 || path.getBytes().getByte(1) != 92) {
                return 1;
            }
            int iIndexOf = path.getBytes().indexOf(BACKSLASH, 2);
            return iIndexOf == -1 ? path.getBytes().size() : iIndexOf;
        }
        if (path.getBytes().size() > 2 && path.getBytes().getByte(1) == 58 && path.getBytes().getByte(2) == 92) {
            char c10 = (char) path.getBytes().getByte(0);
            if ('a' <= c10 && c10 < '{') {
                return 3;
            }
            if ('A' <= c10 && c10 < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean startsWithVolumeLetterAndColon(Buffer buffer, ByteString byteString) {
        if (!AbstractC3340k.a(byteString, BACKSLASH) || buffer.size() < 2 || buffer.getByte(1L) != 58) {
            return false;
        }
        char c10 = (char) buffer.getByte(0L);
        if ('a' > c10 || c10 >= '{') {
            return 'A' <= c10 && c10 < '[';
        }
        return true;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path toPath(@NotNull Buffer buffer, boolean z2) throws EOFException {
        ByteString byteString;
        ByteString byteString2;
        AbstractC3340k.e(buffer, "<this>");
        Buffer buffer2 = new Buffer();
        ByteString slash = null;
        int i5 = 0;
        while (true) {
            if (!buffer.rangeEquals(0L, SLASH)) {
                byteString = BACKSLASH;
                if (!buffer.rangeEquals(0L, byteString)) {
                    break;
                }
            }
            byte b5 = buffer.readByte();
            if (slash == null) {
                slash = toSlash(b5);
            }
            i5++;
        }
        boolean z10 = i5 >= 2 && AbstractC3340k.a(slash, byteString);
        if (z10) {
            AbstractC3340k.b(slash);
            buffer2.write(slash);
            buffer2.write(slash);
        } else if (i5 > 0) {
            AbstractC3340k.b(slash);
            buffer2.write(slash);
        } else {
            long jIndexOfElement = buffer.indexOfElement(ANY_SLASH);
            if (slash == null) {
                slash = jIndexOfElement == -1 ? toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR) : toSlash(buffer.getByte(jIndexOfElement));
            }
            if (startsWithVolumeLetterAndColon(buffer, slash)) {
                if (jIndexOfElement == 2) {
                    buffer2.write(buffer, 3L);
                } else {
                    buffer2.write(buffer, 2L);
                }
            }
        }
        boolean z11 = buffer2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!buffer.exhausted()) {
            long jIndexOfElement2 = buffer.indexOfElement(ANY_SLASH);
            if (jIndexOfElement2 == -1) {
                byteString2 = buffer.readByteString();
            } else {
                byteString2 = buffer.readByteString(jIndexOfElement2);
                buffer.readByte();
            }
            ByteString byteString3 = DOT_DOT;
            if (AbstractC3340k.a(byteString2, byteString3)) {
                if (!z11 || !arrayList.isEmpty()) {
                    if (!z2 || (!z11 && (arrayList.isEmpty() || AbstractC3340k.a(o.y0(arrayList), byteString3)))) {
                        arrayList.add(byteString2);
                    } else if (!z10 || arrayList.size() != 1) {
                        if (!arrayList.isEmpty()) {
                            arrayList.remove(AbstractC3935e.z(arrayList));
                        }
                    }
                }
            } else if (!AbstractC3340k.a(byteString2, DOT) && !AbstractC3340k.a(byteString2, ByteString.EMPTY)) {
                arrayList.add(byteString2);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                buffer2.write(slash);
            }
            buffer2.write((ByteString) arrayList.get(i10));
        }
        if (buffer2.size() == 0) {
            buffer2.write(DOT);
        }
        return new com.applovin.shadow.okio.Path(buffer2.readByteString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteString toSlash(String str) {
        if (AbstractC3340k.a(str, "/")) {
            return SLASH;
        }
        if (AbstractC3340k.a(str, "\\")) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(v.f("not a directory separator: ", str));
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonResolve(@NotNull com.applovin.shadow.okio.Path path, @NotNull ByteString child, boolean z2) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(child, "child");
        return commonResolve(path, toPath(new Buffer().write(child), false), z2);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonResolve(@NotNull com.applovin.shadow.okio.Path path, @NotNull Buffer child, boolean z2) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(child, "child");
        return commonResolve(path, toPath(child, false), z2);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Path commonResolve(@NotNull com.applovin.shadow.okio.Path path, @NotNull com.applovin.shadow.okio.Path child, boolean z2) {
        AbstractC3340k.e(path, "<this>");
        AbstractC3340k.e(child, "child");
        if (child.isAbsolute() || child.volumeLetter() != null) {
            return child;
        }
        ByteString slash = getSlash(path);
        if (slash == null && (slash = getSlash(child)) == null) {
            slash = toSlash(com.applovin.shadow.okio.Path.DIRECTORY_SEPARATOR);
        }
        Buffer buffer = new Buffer();
        buffer.write(path.getBytes());
        if (buffer.size() > 0) {
            buffer.write(slash);
        }
        buffer.write(child.getBytes());
        return toPath(buffer, z2);
    }

    private static final ByteString toSlash(byte b5) {
        if (b5 == 47) {
            return SLASH;
        }
        if (b5 == 92) {
            return BACKSLASH;
        }
        throw new IllegalArgumentException(AbstractC3256n.g(b5, "not a directory separator: "));
    }
}
