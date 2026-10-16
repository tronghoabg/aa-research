.class public final enum Lcom/moloco/sdk/I;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# static fields
.field public static final enum b:Lcom/moloco/sdk/I;

.field public static final enum c:Lcom/moloco/sdk/I;

.field public static final enum d:Lcom/moloco/sdk/I;

.field public static final enum e:Lcom/moloco/sdk/I;

.field public static final synthetic f:[Lcom/moloco/sdk/I;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lcom/moloco/sdk/I;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lcom/moloco/sdk/I;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, Lcom/moloco/sdk/I;

    .line 10
    .line 11
    const-string v3, "WIFI"

    .line 12
    .line 13
    const/4 v4, 0x1

    .line 14
    invoke-direct {v1, v3, v4, v4}, Lcom/moloco/sdk/I;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lcom/moloco/sdk/I;->b:Lcom/moloco/sdk/I;

    .line 18
    .line 19
    new-instance v3, Lcom/moloco/sdk/I;

    .line 20
    .line 21
    const-string v5, "CELLULAR"

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    invoke-direct {v3, v5, v6, v6}, Lcom/moloco/sdk/I;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    sput-object v3, Lcom/moloco/sdk/I;->c:Lcom/moloco/sdk/I;

    .line 28
    .line 29
    new-instance v5, Lcom/moloco/sdk/I;

    .line 30
    .line 31
    const-string v7, "NO_NETWORK"

    .line 32
    .line 33
    const/4 v8, 0x3

    .line 34
    invoke-direct {v5, v7, v8, v8}, Lcom/moloco/sdk/I;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v5, Lcom/moloco/sdk/I;->d:Lcom/moloco/sdk/I;

    .line 38
    .line 39
    new-instance v7, Lcom/moloco/sdk/I;

    .line 40
    .line 41
    const/4 v9, -0x1

    .line 42
    const-string v10, "UNRECOGNIZED"

    .line 43
    .line 44
    const/4 v11, 0x4

    .line 45
    invoke-direct {v7, v10, v11, v9}, Lcom/moloco/sdk/I;-><init>(Ljava/lang/String;II)V

    .line 46
    .line 47
    .line 48
    sput-object v7, Lcom/moloco/sdk/I;->e:Lcom/moloco/sdk/I;

    .line 49
    .line 50
    const/4 v9, 0x5

    .line 51
    new-array v9, v9, [Lcom/moloco/sdk/I;

    .line 52
    .line 53
    aput-object v0, v9, v2

    .line 54
    .line 55
    aput-object v1, v9, v4

    .line 56
    .line 57
    aput-object v3, v9, v6

    .line 58
    .line 59
    aput-object v5, v9, v8

    .line 60
    .line 61
    aput-object v7, v9, v11

    .line 62
    .line 63
    sput-object v9, Lcom/moloco/sdk/I;->f:[Lcom/moloco/sdk/I;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/moloco/sdk/I;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moloco/sdk/I;
    .locals 1

    .line 1
    const-class v0, Lcom/moloco/sdk/I;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/I;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/moloco/sdk/I;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/I;->f:[Lcom/moloco/sdk/I;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/moloco/sdk/I;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/moloco/sdk/I;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 2

    .line 1
    sget-object v0, Lcom/moloco/sdk/I;->e:Lcom/moloco/sdk/I;

    .line 2
    .line 3
    if-eq p0, v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/moloco/sdk/I;->a:I

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "Can\'t get the number of an unknown enum value."

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method
