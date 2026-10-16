package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TypeOrBuilder extends MessageLiteOrBuilder {
    String getEdition();

    ByteString getEditionBytes();

    Field getFields(int i2);

    int getFieldsCount();

    List<Field> getFieldsList();

    String getName();

    ByteString getNameBytes();

    String getOneofs(int i2);

    ByteString getOneofsBytes(int i2);

    int getOneofsCount();

    List<String> getOneofsList();

    Option getOptions(int i2);

    int getOptionsCount();

    List<Option> getOptionsList();

    SourceContext getSourceContext();

    Syntax getSyntax();

    int getSyntaxValue();

    boolean hasSourceContext();
}
