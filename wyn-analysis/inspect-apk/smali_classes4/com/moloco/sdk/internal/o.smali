.class public final enum Lcom/moloco/sdk/internal/o;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/c;


# static fields
.field public static final enum a:Lcom/moloco/sdk/internal/o;

.field public static final enum b:Lcom/moloco/sdk/internal/o;

.field public static final enum c:Lcom/moloco/sdk/internal/o;

.field public static final enum d:Lcom/moloco/sdk/internal/o;

.field public static final enum e:Lcom/moloco/sdk/internal/o;

.field public static final enum f:Lcom/moloco/sdk/internal/o;

.field public static final synthetic g:[Lcom/moloco/sdk/internal/o;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    const/4 v0, 0x6

    .line 2
    const/4 v1, 0x5

    .line 3
    const/4 v2, 0x4

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x2

    .line 6
    const/4 v5, 0x1

    .line 7
    const/4 v6, 0x0

    .line 8
    new-instance v7, Lcom/moloco/sdk/internal/o;

    .line 9
    .line 10
    const-string v8, "AD_LOAD_LIMIT_REACHED"

    .line 11
    .line 12
    invoke-direct {v7, v8, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    new-instance v8, Lcom/moloco/sdk/internal/o;

    .line 16
    .line 17
    const-string v9, "BID_LOAD_ERROR_CANNOT_PROCESS_BID_RESPONSE"

    .line 18
    .line 19
    invoke-direct {v8, v9, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    sput-object v8, Lcom/moloco/sdk/internal/o;->a:Lcom/moloco/sdk/internal/o;

    .line 23
    .line 24
    new-instance v9, Lcom/moloco/sdk/internal/o;

    .line 25
    .line 26
    const-string v10, "BID_LOAD_ERROR_PARSE_INVALID_JSON"

    .line 27
    .line 28
    invoke-direct {v9, v10, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    sput-object v9, Lcom/moloco/sdk/internal/o;->b:Lcom/moloco/sdk/internal/o;

    .line 32
    .line 33
    new-instance v10, Lcom/moloco/sdk/internal/o;

    .line 34
    .line 35
    const-string v11, "BID_LOAD_ERROR_PARSE_MISSING_REQUIRED_FIELD"

    .line 36
    .line 37
    invoke-direct {v10, v11, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    sput-object v10, Lcom/moloco/sdk/internal/o;->c:Lcom/moloco/sdk/internal/o;

    .line 41
    .line 42
    new-instance v11, Lcom/moloco/sdk/internal/o;

    .line 43
    .line 44
    const-string v12, "BID_LOAD_ERROR_CANNOT_PARSE_BID_RESPONSE"

    .line 45
    .line 46
    invoke-direct {v11, v12, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v11, Lcom/moloco/sdk/internal/o;->d:Lcom/moloco/sdk/internal/o;

    .line 50
    .line 51
    new-instance v12, Lcom/moloco/sdk/internal/o;

    .line 52
    .line 53
    const-string v13, "AD_SHOW_ERROR_NOT_LOADED"

    .line 54
    .line 55
    invoke-direct {v12, v13, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    sput-object v12, Lcom/moloco/sdk/internal/o;->e:Lcom/moloco/sdk/internal/o;

    .line 59
    .line 60
    new-instance v13, Lcom/moloco/sdk/internal/o;

    .line 61
    .line 62
    const-string v14, "AD_SHOW_ERROR_ALREADY_DISPLAYING"

    .line 63
    .line 64
    invoke-direct {v13, v14, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    sput-object v13, Lcom/moloco/sdk/internal/o;->f:Lcom/moloco/sdk/internal/o;

    .line 68
    .line 69
    const/4 v14, 0x7

    .line 70
    new-array v14, v14, [Lcom/moloco/sdk/internal/o;

    .line 71
    .line 72
    aput-object v7, v14, v6

    .line 73
    .line 74
    aput-object v8, v14, v5

    .line 75
    .line 76
    aput-object v9, v14, v4

    .line 77
    .line 78
    aput-object v10, v14, v3

    .line 79
    .line 80
    aput-object v11, v14, v2

    .line 81
    .line 82
    aput-object v12, v14, v1

    .line 83
    .line 84
    aput-object v13, v14, v0

    .line 85
    .line 86
    sput-object v14, Lcom/moloco/sdk/internal/o;->g:[Lcom/moloco/sdk/internal/o;

    .line 87
    .line 88
    invoke-static {v14}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moloco/sdk/internal/o;
    .locals 1

    .line 1
    const-class v0, Lcom/moloco/sdk/internal/o;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/internal/o;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/moloco/sdk/internal/o;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/o;->g:[Lcom/moloco/sdk/internal/o;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/moloco/sdk/internal/o;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
