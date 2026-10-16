package com.google.protobuf;

import java.util.List;

/* loaded from: classes4.dex */
public interface EnumValueOrBuilder extends MessageLiteOrBuilder {
    String getName();

    ByteString getNameBytes();

    int getNumber();

    Option getOptions(int i5);

    int getOptionsCount();

    List<Option> getOptionsList();
}
