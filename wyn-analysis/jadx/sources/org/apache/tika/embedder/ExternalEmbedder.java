package org.apache.tika.embedder;

import A7.AbstractC0279p0;
import gg.c;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kg.e;
import ng.a;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.Property;
import org.apache.tika.mime.MediaType;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.external.ExternalParser;

/* loaded from: classes5.dex */
public class ExternalEmbedder implements Embedder {
    public static final String METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN = "${METADATA_SERIALIZED}";
    public static final String METADATA_COMMAND_ARGUMENTS_TOKEN = "${METADATA}";
    private static final long serialVersionUID = -2828829275642475697L;
    private final TemporaryResources tmp = new TemporaryResources();
    private Set<MediaType> supportedEmbedTypes = Collections.EMPTY_SET;
    private Map<Property, String[]> metadataCommandArguments = null;
    private String[] command = {"sed", "-e", "$a\\\n${METADATA_SERIALIZED}", ExternalParser.INPUT_FILE_TOKEN};
    private String commandAssignmentOperator = "=";
    private String commandAssignmentDelimeter = ", ";
    private String commandAppendOperator = "=";
    private boolean quoteAssignmentValues = false;

    public static boolean check(String str, int... iArr) {
        return check(new String[]{str}, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$multiThreadedStreamCopy$0(InputStream inputStream, OutputStream outputStream) {
        try {
            c.b(inputStream, outputStream);
        } catch (IOException e7) {
            System.out.println("ERROR: " + e7.getMessage());
        }
    }

    private void multiThreadedStreamCopy(InputStream inputStream, OutputStream outputStream) {
        new Thread(new a(0, inputStream, outputStream)).start();
    }

    private void sendInputStreamToStdIn(InputStream inputStream, Process process) {
        multiThreadedStreamCopy(inputStream, process.getOutputStream());
    }

    private void sendStdErrToOutputStream(Process process, OutputStream outputStream) {
        multiThreadedStreamCopy(process.getErrorStream(), outputStream);
    }

    private void sendStdOutToOutputStream(Process process, OutputStream outputStream) {
        try {
            c.b(process.getInputStream(), outputStream);
        } catch (IOException e7) {
            System.out.println("ERROR: " + e7.getMessage());
        }
    }

    public static String serializeMetadata(List<String> list) {
        return list != null ? Arrays.toString(list.toArray()) : "";
    }

    @Override // org.apache.tika.embedder.Embedder
    public void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) throws TikaException, InterruptedException, IOException {
        TikaInputStream tikaInputStream;
        Map<Property, String[]> map = this.metadataCommandArguments;
        boolean z2 = (map == null || map.isEmpty()) ? false : true;
        TikaInputStream tikaInputStream2 = TikaInputStream.get(inputStream);
        File file = null;
        List<String> commandMetadataSegments = z2 ? getCommandMetadataSegments(metadata) : null;
        String[] strArr = this.command;
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i5 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = true;
        while (i5 < length) {
            String strReplace = strArr[i5];
            boolean z14 = z2;
            if (strReplace.contains(ExternalParser.INPUT_FILE_TOKEN)) {
                tikaInputStream = tikaInputStream2;
                strReplace = strReplace.replace(ExternalParser.INPUT_FILE_TOKEN, tikaInputStream2.getFile().toString());
                z12 = false;
            } else {
                tikaInputStream = tikaInputStream2;
            }
            if (strReplace.contains(ExternalParser.OUTPUT_FILE_TOKEN)) {
                File fileCreateTemporaryFile = this.tmp.createTemporaryFile();
                strReplace = strReplace.replace(ExternalParser.OUTPUT_FILE_TOKEN, fileCreateTemporaryFile.toString());
                file = fileCreateTemporaryFile;
                z13 = false;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                z10 = true;
            }
            if (strReplace.contains(METADATA_COMMAND_ARGUMENTS_TOKEN)) {
                if (z14) {
                    arrayList.addAll(commandMetadataSegments);
                }
                z11 = true;
            } else {
                arrayList.add(strReplace);
            }
            i5++;
            z2 = z14;
            tikaInputStream2 = tikaInputStream;
        }
        TikaInputStream tikaInputStream3 = tikaInputStream2;
        if (z2) {
            if (z10) {
                Iterator it = arrayList.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str.contains(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN)) {
                        arrayList.set(i10, str.replace(METADATA_COMMAND_ARGUMENTS_SERIALIZED_TOKEN, serializeMetadata(commandMetadataSegments)));
                    }
                    i10++;
                }
            } else if (!z11 && !z10) {
                arrayList.addAll(commandMetadataSegments);
            }
        }
        Process processExec = arrayList.toArray().length == 1 ? Runtime.getRuntime().exec(((String[]) arrayList.toArray(new String[0]))[0]) : Runtime.getRuntime().exec((String[]) arrayList.toArray(new String[0]));
        int i11 = lg.c.f40290f;
        new e();
        lg.c cVar = new lg.c();
        try {
            sendStdErrToOutputStream(processExec, cVar);
            if (z12) {
                sendInputStreamToStdIn(inputStream, processExec);
            } else {
                processExec.getOutputStream().close();
            }
            if (z13) {
                sendStdOutToOutputStream(processExec, outputStream);
            } else {
                this.tmp.dispose();
                try {
                    processExec.waitFor();
                } catch (InterruptedException unused) {
                }
                c.b(TikaInputStream.get(file), outputStream);
            }
            if (z13) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused2) {
                }
            } else {
                file.delete();
            }
            if (!z12) {
                c.a(tikaInputStream3);
            }
            c.a(outputStream);
            c.a(cVar);
            if (processExec.exitValue() == 0) {
                return;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(cVar.b(), StandardCharsets.UTF_8.name()));
        } catch (Throwable th) {
            if (z13) {
                try {
                    processExec.waitFor();
                } catch (InterruptedException | Exception unused3) {
                }
            } else {
                file.delete();
            }
            if (!z12) {
                c.a(tikaInputStream3);
            }
            c.a(outputStream);
            c.a(cVar);
            if (processExec.exitValue() == 0) {
                throw th;
            }
            throw new TikaException("There was an error executing the command line\nExecutable Command:\n\n" + arrayList + "\nExecutable Error:\n\n" + new String(cVar.b(), StandardCharsets.UTF_8.name()));
        }
    }

    public String[] getCommand() {
        return this.command;
    }

    public String getCommandAppendOperator() {
        return this.commandAppendOperator;
    }

    public String getCommandAssignmentDelimeter() {
        return this.commandAssignmentDelimeter;
    }

    public String getCommandAssignmentOperator() {
        return this.commandAssignmentOperator;
    }

    public List<String> getCommandMetadataSegments(Metadata metadata) {
        String[] strArr;
        String[] strArr2;
        int i5;
        ArrayList arrayList = new ArrayList();
        if (metadata != null && metadata.names() != null) {
            String[] strArrNames = metadata.names();
            int length = strArrNames.length;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArrNames[i10];
                for (Property property : getMetadataCommandArguments().keySet()) {
                    if (str.equals(property.getName()) && (strArr = getMetadataCommandArguments().get(property)) != null) {
                        int length2 = strArr.length;
                        int i11 = 0;
                        while (i11 < length2) {
                            String str2 = strArr[i11];
                            if (metadata.isMultiValued(str)) {
                                String[] values = metadata.getValues(str);
                                int length3 = values.length;
                                int i12 = 0;
                                while (true) {
                                    strArr2 = strArrNames;
                                    if (i12 >= length3) {
                                        break;
                                    }
                                    String strL = values[i12];
                                    int i13 = length;
                                    if (this.quoteAssignmentValues) {
                                        strL = AbstractC0279p0.l("'", strL, "'");
                                    }
                                    arrayList.add(str2 + this.commandAppendOperator + strL);
                                    i12++;
                                    strArrNames = strArr2;
                                    length = i13;
                                }
                                i5 = length;
                            } else {
                                strArr2 = strArrNames;
                                i5 = length;
                                String strL2 = metadata.get(str);
                                if (this.quoteAssignmentValues) {
                                    strL2 = AbstractC0279p0.l("'", strL2, "'");
                                }
                                arrayList.add(str2 + this.commandAssignmentOperator + strL2);
                            }
                            i11++;
                            strArrNames = strArr2;
                            length = i5;
                        }
                    }
                    strArrNames = strArrNames;
                    length = length;
                }
            }
        }
        return arrayList;
    }

    public Map<Property, String[]> getMetadataCommandArguments() {
        return this.metadataCommandArguments;
    }

    @Override // org.apache.tika.embedder.Embedder
    public Set<MediaType> getSupportedEmbedTypes(ParseContext parseContext) {
        return getSupportedEmbedTypes();
    }

    public boolean isQuoteAssignmentValues() {
        return this.quoteAssignmentValues;
    }

    public void setCommand(String... strArr) {
        this.command = strArr;
    }

    public void setCommandAppendOperator(String str) {
        this.commandAppendOperator = str;
    }

    public void setCommandAssignmentDelimeter(String str) {
        this.commandAssignmentDelimeter = str;
    }

    public void setCommandAssignmentOperator(String str) {
        this.commandAssignmentOperator = str;
    }

    public void setMetadataCommandArguments(Map<Property, String[]> map) {
        this.metadataCommandArguments = map;
    }

    public void setQuoteAssignmentValues(boolean z2) {
        this.quoteAssignmentValues = z2;
    }

    public void setSupportedEmbedTypes(Set<MediaType> set) {
        this.supportedEmbedTypes = DesugarCollections.unmodifiableSet(new HashSet(set));
    }

    public static boolean check(String[] strArr, int... iArr) throws InterruptedException {
        if (iArr.length == 0) {
            iArr = new int[]{127};
        }
        try {
            int iWaitFor = (strArr.length == 1 ? Runtime.getRuntime().exec(strArr[0]) : Runtime.getRuntime().exec(strArr)).waitFor();
            for (int i5 : iArr) {
                if (iWaitFor == i5) {
                    return false;
                }
            }
            return true;
        } catch (IOException | InterruptedException unused) {
            return false;
        }
    }

    public Set<MediaType> getSupportedEmbedTypes() {
        return this.supportedEmbedTypes;
    }
}
