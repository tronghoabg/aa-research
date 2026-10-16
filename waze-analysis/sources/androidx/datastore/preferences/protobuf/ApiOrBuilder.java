package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface ApiOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Method getMethods(int i2);

    int getMethodsCount();

    List<Method> getMethodsList();

    Mixin getMixins(int i2);

    int getMixinsCount();

    List<Mixin> getMixinsList();

    String getName();

    ByteString getNameBytes();

    Option getOptions(int i2);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    String getVersion();

    ByteString getVersionBytes();

    boolean hasSourceContext();
}
