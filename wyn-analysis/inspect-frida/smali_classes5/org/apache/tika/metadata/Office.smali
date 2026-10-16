.class public interface abstract Lorg/apache/tika/metadata/Office;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final CHARACTER_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final CHARACTER_COUNT_WITH_SPACES:Lorg/apache/tika/metadata/Property;

.field public static final CREATION_DATE:Lorg/apache/tika/metadata/Property;

.field public static final IMAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final INITIAL_AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final KEYWORDS:Lorg/apache/tika/metadata/Property;

.field public static final LAST_AUTHOR:Lorg/apache/tika/metadata/Property;

.field public static final LINE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_IMPORTANCE:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_IS_FLAGGED:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_MESSAGE_CLIENT_SUBMIT_TIME:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_PRIORTY:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

.field public static final MAPI_SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

.field public static final NAMESPACE_URI_DOC_META:Ljava/lang/String; = "urn:oasis:names:tc:opendocument:xmlns:meta:1.0"

.field public static final OBJECT_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final OCX_NAME:Lorg/apache/tika/metadata/Property;

.field public static final PAGE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final PARAGRAPH_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final PREFIX_DOC_META:Ljava/lang/String; = "meta"

.field public static final PRINT_DATE:Lorg/apache/tika/metadata/Property;

.field public static final PROG_ID:Lorg/apache/tika/metadata/Property;

.field public static final SAVE_DATE:Lorg/apache/tika/metadata/Property;

.field public static final SLIDE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final TABLE_COUNT:Lorg/apache/tika/metadata/Property;

.field public static final USER_DEFINED_METADATA_NAME_PREFIX:Ljava/lang/String; = "custom:"

.field public static final WORD_COUNT:Lorg/apache/tika/metadata/Property;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const-string v0, "meta:keyword"

    .line 2
    .line 3
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Lorg/apache/tika/metadata/Property;

    .line 9
    .line 10
    sget-object v2, Lorg/apache/tika/metadata/DublinCore;->SUBJECT:Lorg/apache/tika/metadata/Property;

    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    aput-object v2, v1, v3

    .line 14
    .line 15
    invoke-static {v0, v1}, Lorg/apache/tika/metadata/Property;->composite(Lorg/apache/tika/metadata/Property;[Lorg/apache/tika/metadata/Property;)Lorg/apache/tika/metadata/Property;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lorg/apache/tika/metadata/Office;->KEYWORDS:Lorg/apache/tika/metadata/Property;

    .line 20
    .line 21
    const-string v0, "meta:initial-author"

    .line 22
    .line 23
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lorg/apache/tika/metadata/Office;->INITIAL_AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 28
    .line 29
    const-string v0, "meta:last-author"

    .line 30
    .line 31
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lorg/apache/tika/metadata/Office;->LAST_AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 36
    .line 37
    const-string v0, "meta:author"

    .line 38
    .line 39
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalTextBag(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, Lorg/apache/tika/metadata/Office;->AUTHOR:Lorg/apache/tika/metadata/Property;

    .line 44
    .line 45
    const-string v0, "meta:creation-date"

    .line 46
    .line 47
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lorg/apache/tika/metadata/Office;->CREATION_DATE:Lorg/apache/tika/metadata/Property;

    .line 52
    .line 53
    const-string v0, "meta:save-date"

    .line 54
    .line 55
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lorg/apache/tika/metadata/Office;->SAVE_DATE:Lorg/apache/tika/metadata/Property;

    .line 60
    .line 61
    const-string v0, "meta:print-date"

    .line 62
    .line 63
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lorg/apache/tika/metadata/Office;->PRINT_DATE:Lorg/apache/tika/metadata/Property;

    .line 68
    .line 69
    const-string v0, "meta:slide-count"

    .line 70
    .line 71
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lorg/apache/tika/metadata/Office;->SLIDE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 76
    .line 77
    const-string v0, "meta:page-count"

    .line 78
    .line 79
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    sput-object v0, Lorg/apache/tika/metadata/Office;->PAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 84
    .line 85
    const-string v0, "meta:paragraph-count"

    .line 86
    .line 87
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    sput-object v0, Lorg/apache/tika/metadata/Office;->PARAGRAPH_COUNT:Lorg/apache/tika/metadata/Property;

    .line 92
    .line 93
    const-string v0, "meta:line-count"

    .line 94
    .line 95
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    sput-object v0, Lorg/apache/tika/metadata/Office;->LINE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 100
    .line 101
    const-string v0, "meta:word-count"

    .line 102
    .line 103
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lorg/apache/tika/metadata/Office;->WORD_COUNT:Lorg/apache/tika/metadata/Property;

    .line 108
    .line 109
    const-string v0, "meta:character-count"

    .line 110
    .line 111
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    sput-object v0, Lorg/apache/tika/metadata/Office;->CHARACTER_COUNT:Lorg/apache/tika/metadata/Property;

    .line 116
    .line 117
    const-string v0, "meta:character-count-with-spaces"

    .line 118
    .line 119
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    sput-object v0, Lorg/apache/tika/metadata/Office;->CHARACTER_COUNT_WITH_SPACES:Lorg/apache/tika/metadata/Property;

    .line 124
    .line 125
    const-string v0, "meta:table-count"

    .line 126
    .line 127
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sput-object v0, Lorg/apache/tika/metadata/Office;->TABLE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 132
    .line 133
    const-string v0, "meta:image-count"

    .line 134
    .line 135
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sput-object v0, Lorg/apache/tika/metadata/Office;->IMAGE_COUNT:Lorg/apache/tika/metadata/Property;

    .line 140
    .line 141
    const-string v0, "meta:object-count"

    .line 142
    .line 143
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    sput-object v0, Lorg/apache/tika/metadata/Office;->OBJECT_COUNT:Lorg/apache/tika/metadata/Property;

    .line 148
    .line 149
    const-string v7, "UNKNOWN"

    .line 150
    .line 151
    const-string v8, "UNSPECIFIED"

    .line 152
    .line 153
    const-string v1, "APPOINTMENT"

    .line 154
    .line 155
    const-string v2, "CONTACT"

    .line 156
    .line 157
    const-string v3, "NOTE"

    .line 158
    .line 159
    const-string v4, "STICKY_NOTE"

    .line 160
    .line 161
    const-string v5, "POST"

    .line 162
    .line 163
    const-string v6, "TASK"

    .line 164
    .line 165
    filled-new-array/range {v1 .. v8}, [Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    const-string v1, "meta:mapi-message-class"

    .line 170
    .line 171
    invoke-static {v1, v0}, Lorg/apache/tika/metadata/Property;->internalClosedChoise(Ljava/lang/String;[Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_MESSAGE_CLASS:Lorg/apache/tika/metadata/Property;

    .line 176
    .line 177
    const-string v0, "meta:mapi-sent-by-server-type"

    .line 178
    .line 179
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_SENT_BY_SERVER_TYPE:Lorg/apache/tika/metadata/Property;

    .line 184
    .line 185
    const-string v0, "meta:mapi-from-representing-name"

    .line 186
    .line 187
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_FROM_REPRESENTING_NAME:Lorg/apache/tika/metadata/Property;

    .line 192
    .line 193
    const-string v0, "meta:mapi-from-representing-email"

    .line 194
    .line 195
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_FROM_REPRESENTING_EMAIL:Lorg/apache/tika/metadata/Property;

    .line 200
    .line 201
    const-string v0, "meta:mapi-msg-client-submit-time"

    .line 202
    .line 203
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalDate(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_MESSAGE_CLIENT_SUBMIT_TIME:Lorg/apache/tika/metadata/Property;

    .line 208
    .line 209
    const-string v0, "msoffice:progID"

    .line 210
    .line 211
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    sput-object v0, Lorg/apache/tika/metadata/Office;->PROG_ID:Lorg/apache/tika/metadata/Property;

    .line 216
    .line 217
    const-string v0, "msoffice:ocxName"

    .line 218
    .line 219
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sput-object v0, Lorg/apache/tika/metadata/Office;->OCX_NAME:Lorg/apache/tika/metadata/Property;

    .line 224
    .line 225
    const-string v0, "meta:mapi-recipients-string"

    .line 226
    .line 227
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalText(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_RECIPIENTS_STRING:Lorg/apache/tika/metadata/Property;

    .line 232
    .line 233
    const-string v0, "meta:mapi-importance"

    .line 234
    .line 235
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    sput-object v1, Lorg/apache/tika/metadata/Office;->MAPI_IMPORTANCE:Lorg/apache/tika/metadata/Property;

    .line 240
    .line 241
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalInteger(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 242
    .line 243
    .line 244
    move-result-object v0

    .line 245
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_PRIORTY:Lorg/apache/tika/metadata/Property;

    .line 246
    .line 247
    const-string v0, "meta:mapi-is-flagged"

    .line 248
    .line 249
    invoke-static {v0}, Lorg/apache/tika/metadata/Property;->internalBoolean(Ljava/lang/String;)Lorg/apache/tika/metadata/Property;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    sput-object v0, Lorg/apache/tika/metadata/Office;->MAPI_IS_FLAGGED:Lorg/apache/tika/metadata/Property;

    .line 254
    .line 255
    return-void
.end method
