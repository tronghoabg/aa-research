package com.applovin.shadow.okio;

import ff.AbstractC2651f;
import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.tika.fork.ForkServer;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u0018B!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/applovin/shadow/okio/Options;", "Lff/f;", "Lcom/applovin/shadow/okio/ByteString;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lcg/j;[I)V", "", "index", "get", "(I)Lcom/applovin/shadow/okio/ByteString;", "[Lcom/applovin/shadow/okio/ByteString;", "getByteStrings$okio", "()[Lcg/j;", "[I", "getTrie$okio", "()[I", "getSize", "()I", "size", "Companion", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Options extends AbstractC2651f implements RandomAccess {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ByteString[] byteStrings;

    @NotNull
    private final int[] trie;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/applovin/shadow/okio/Options$Companion;", "", "<init>", "()V", "", "nodeOffset", "Lcom/applovin/shadow/okio/Buffer;", "node", "", "byteStringOffset", "", "Lcom/applovin/shadow/okio/ByteString;", "byteStrings", "fromIndex", "toIndex", "indexes", "Lef/C;", "buildTrieRecursive", "(JLcom/applovin/shadow/okio/Buffer;ILjava/util/List;IILjava/util/List;)V", "", "Lcom/applovin/shadow/okio/Options;", "of", "([Lcg/j;)Lcg/x;", "getIntCount", "(Lcg/g;)J", "intCount", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void buildTrieRecursive(long nodeOffset, Buffer node, int byteStringOffset, List<? extends ByteString> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i5;
            int i10;
            int i11;
            long j8;
            int i12 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i13 = fromIndex; i13 < toIndex; i13++) {
                if (byteStrings.get(i13).size() < i12) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            ByteString byteString = byteStrings.get(fromIndex);
            ByteString byteString2 = byteStrings.get(toIndex - 1);
            if (i12 == byteString.size()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i14 = fromIndex + 1;
                ByteString byteString3 = byteStrings.get(i14);
                i5 = i14;
                i10 = iIntValue;
                byteString = byteString3;
            } else {
                i5 = fromIndex;
                i10 = -1;
            }
            if (byteString.getByte(i12) == byteString2.getByte(i12)) {
                int iMin = Math.min(byteString.size(), byteString2.size());
                int i15 = 0;
                for (int i16 = i12; i16 < iMin && byteString.getByte(i16) == byteString2.getByte(i16); i16++) {
                    i15++;
                }
                long intCount = nodeOffset + getIntCount(node) + 2 + i15 + 1;
                node.writeInt(-i15);
                node.writeInt(i10);
                int i17 = i12 + i15;
                while (i12 < i17) {
                    node.writeInt(byteString.getByte(i12) & ForkServer.ERROR);
                    i12++;
                }
                if (i5 + 1 == toIndex) {
                    if (i17 != byteStrings.get(i5).size()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i5).intValue());
                    return;
                } else {
                    Buffer buffer = new Buffer();
                    node.writeInt(((int) (getIntCount(buffer) + intCount)) * (-1));
                    buildTrieRecursive(intCount, buffer, i17, byteStrings, i5, toIndex, indexes);
                    node.writeAll(buffer);
                    return;
                }
            }
            int i18 = 1;
            for (int i19 = i5 + 1; i19 < toIndex; i19++) {
                if (byteStrings.get(i19 - 1).getByte(i12) != byteStrings.get(i19).getByte(i12)) {
                    i18++;
                }
            }
            long intCount2 = nodeOffset + getIntCount(node) + 2 + (i18 * 2);
            node.writeInt(i18);
            node.writeInt(i10);
            for (int i20 = i5; i20 < toIndex; i20++) {
                byte b5 = byteStrings.get(i20).getByte(i12);
                if (i20 == i5 || b5 != byteStrings.get(i20 - 1).getByte(i12)) {
                    node.writeInt(b5 & ForkServer.ERROR);
                }
            }
            Buffer buffer2 = new Buffer();
            while (i5 < toIndex) {
                byte b10 = byteStrings.get(i5).getByte(i12);
                int i21 = i5 + 1;
                int i22 = i21;
                while (true) {
                    if (i22 >= toIndex) {
                        i11 = toIndex;
                        break;
                    } else {
                        if (b10 != byteStrings.get(i22).getByte(i12)) {
                            i11 = i22;
                            break;
                        }
                        i22++;
                    }
                }
                if (i21 == i11 && i12 + 1 == byteStrings.get(i5).size()) {
                    node.writeInt(indexes.get(i5).intValue());
                    j8 = intCount2;
                } else {
                    node.writeInt(((int) (getIntCount(buffer2) + intCount2)) * (-1));
                    j8 = intCount2;
                    buildTrieRecursive(j8, buffer2, i12 + 1, byteStrings, i5, i11, indexes);
                }
                intCount2 = j8;
                i5 = i11;
            }
            node.writeAll(buffer2);
        }

        public static /* synthetic */ void buildTrieRecursive$default(Companion companion, long j8, Buffer buffer, int i5, List list, int i10, int i11, List list2, int i12, Object obj) throws IOException {
            if ((i12 & 1) != 0) {
                j8 = 0;
            }
            companion.buildTrieRecursive(j8, buffer, (i12 & 4) != 0 ? 0 : i5, list, (i12 & 16) != 0 ? 0 : i10, (i12 & 32) != 0 ? list.size() : i11, list2);
        }

        private final long getIntCount(Buffer buffer) {
            return buffer.size() / 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
        
            continue;
         */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.applovin.shadow.okio.Options of(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.ByteString... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Options.Companion.of(com.applovin.shadow.okio.ByteString[]):com.applovin.shadow.okio.Options");
        }

        private Companion() {
        }
    }

    public /* synthetic */ Options(ByteString[] byteStringArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteStringArr, iArr);
    }

    @NotNull
    public static final Options of(@NotNull ByteString... byteStringArr) {
        return INSTANCE.of(byteStringArr);
    }

    public /* bridge */ boolean contains(ByteString byteString) {
        return super.contains((Object) byteString);
    }

    @NotNull
    /* renamed from: getByteStrings$okio, reason: from getter */
    public final ByteString[] getByteStrings() {
        return this.byteStrings;
    }

    @Override // ff.AbstractC2646a
    public int getSize() {
        return this.byteStrings.length;
    }

    @NotNull
    /* renamed from: getTrie$okio, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ int indexOf(ByteString byteString) {
        return super.indexOf((Object) byteString);
    }

    public /* bridge */ int lastIndexOf(ByteString byteString) {
        return super.lastIndexOf((Object) byteString);
    }

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    @Override // ff.AbstractC2646a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return contains((ByteString) obj);
        }
        return false;
    }

    @Override // java.util.List
    @NotNull
    public ByteString get(int index) {
        return this.byteStrings[index];
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // ff.AbstractC2651f, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
