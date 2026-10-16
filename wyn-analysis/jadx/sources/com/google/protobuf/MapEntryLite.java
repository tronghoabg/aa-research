package com.google.protobuf;

import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final C1790d1 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        this.metadata = new C1790d1(fieldType, k, fieldType2, v2);
        this.key = k;
        this.value = v2;
    }

    public static <K, V> int computeSerializedSize(C1790d1 c1790d1, K k, V v2) {
        return C1845w0.c(c1790d1.f27660c, 2, v2) + C1845w0.c(c1790d1.f27658a, 1, k);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v2) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v2);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t10) throws IOException {
        int i5 = AbstractC1787c1.f27654a[fieldType.ordinal()];
        if (i5 == 1) {
            MessageLite.Builder builder = ((MessageLite) t10).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i5 == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i5 == 3) {
            throw new RuntimeException("Groups are not allowed in maps.");
        }
        C1845w0 c1845w0 = C1845w0.f27766d;
        return (T) WireFormat.readPrimitiveField(codedInputStream, fieldType, p2.f27733b);
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, C1790d1 c1790d1, K k, V v2) throws IOException {
        C1845w0.r(codedOutputStream, c1790d1.f27658a, 1, k);
        C1845w0.r(codedOutputStream, c1790d1.f27660c, 2, v2);
    }

    public int computeMessageSize(int i5, K k, V v2) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v2)) + CodedOutputStream.computeTagSize(i5);
    }

    public K getKey() {
        return this.key;
    }

    public C1790d1 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        C1790d1 c1790d1 = this.metadata;
        Object field = c1790d1.f27659b;
        Object field2 = c1790d1.f27661d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.f27658a.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.f27658a, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.f27660c.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.f27660c, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i5, K k, V v2) throws IOException {
        codedOutputStream.writeTag(i5, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v2));
        writeTo(codedOutputStream, this.metadata, k, v2);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, C1790d1 c1790d1, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object field = c1790d1.f27659b;
        Object field2 = c1790d1.f27661d;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            WireFormat.FieldType fieldType = c1790d1.f27658a;
            if (tag == WireFormat.makeTag(1, fieldType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, fieldType, field);
            } else {
                WireFormat.FieldType fieldType2 = c1790d1.f27660c;
                if (tag == WireFormat.makeTag(2, fieldType2.getWireType())) {
                    field2 = parseField(codedInputStream, extensionRegistryLite, fieldType2, field2);
                } else if (!codedInputStream.skipField(tag)) {
                    break;
                }
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private MapEntryLite(C1790d1 c1790d1, K k, V v2) {
        this.metadata = c1790d1;
        this.key = k;
        this.value = v2;
    }
}
