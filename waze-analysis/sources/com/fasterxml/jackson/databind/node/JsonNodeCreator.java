package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public interface JsonNodeCreator {
    ArrayNode arrayNode();

    ArrayNode arrayNode(int i2);

    ValueNode binaryNode(byte[] bArr);

    ValueNode binaryNode(byte[] bArr, int i2, int i3);

    ValueNode booleanNode(boolean z);

    ValueNode nullNode();

    ValueNode numberNode(byte b2);

    ValueNode numberNode(double d2);

    ValueNode numberNode(float f2);

    ValueNode numberNode(int i2);

    ValueNode numberNode(long j2);

    ValueNode numberNode(Byte b2);

    ValueNode numberNode(Double d2);

    ValueNode numberNode(Float f2);

    ValueNode numberNode(Integer num);

    ValueNode numberNode(Long l2);

    ValueNode numberNode(Short sh);

    ValueNode numberNode(BigDecimal bigDecimal);

    ValueNode numberNode(BigInteger bigInteger);

    ValueNode numberNode(short s);

    ObjectNode objectNode();

    ValueNode pojoNode(Object obj);

    ValueNode rawValueNode(RawValue rawValue);

    ValueNode textNode(String str);
}
