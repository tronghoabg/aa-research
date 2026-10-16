.class public final enum Lcom/moloco/sdk/internal/ortb/model/X;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime LSf/e;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/moloco/sdk/internal/ortb/model/X;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:Lcom/moloco/sdk/internal/ortb/model/u$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final a:Ljava/lang/Object;

.field public static final enum b:Lcom/moloco/sdk/internal/ortb/model/X;

.field public static final enum c:Lcom/moloco/sdk/internal/ortb/model/X;

.field public static final enum d:Lcom/moloco/sdk/internal/ortb/model/X;

.field public static final enum e:Lcom/moloco/sdk/internal/ortb/model/X;

.field public static final enum f:Lcom/moloco/sdk/internal/ortb/model/X;

.field public static final synthetic g:[Lcom/moloco/sdk/internal/ortb/model/X;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x3

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x1

    .line 5
    const/4 v4, 0x0

    .line 6
    new-instance v5, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 7
    .line 8
    const-string v6, "Start"

    .line 9
    .line 10
    invoke-direct {v5, v6, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    sput-object v5, Lcom/moloco/sdk/internal/ortb/model/X;->b:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 14
    .line 15
    new-instance v6, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 16
    .line 17
    const-string v7, "Center"

    .line 18
    .line 19
    invoke-direct {v6, v7, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    sput-object v6, Lcom/moloco/sdk/internal/ortb/model/X;->c:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 23
    .line 24
    new-instance v7, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 25
    .line 26
    const-string v8, "End"

    .line 27
    .line 28
    invoke-direct {v7, v8, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    sput-object v7, Lcom/moloco/sdk/internal/ortb/model/X;->d:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 32
    .line 33
    new-instance v8, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 34
    .line 35
    const-string v9, "Left"

    .line 36
    .line 37
    invoke-direct {v8, v9, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    sput-object v8, Lcom/moloco/sdk/internal/ortb/model/X;->e:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 41
    .line 42
    new-instance v9, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 43
    .line 44
    const-string v10, "Right"

    .line 45
    .line 46
    invoke-direct {v9, v10, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v9, Lcom/moloco/sdk/internal/ortb/model/X;->f:Lcom/moloco/sdk/internal/ortb/model/X;

    .line 50
    .line 51
    const/4 v10, 0x5

    .line 52
    new-array v10, v10, [Lcom/moloco/sdk/internal/ortb/model/X;

    .line 53
    .line 54
    aput-object v5, v10, v4

    .line 55
    .line 56
    aput-object v6, v10, v3

    .line 57
    .line 58
    aput-object v7, v10, v2

    .line 59
    .line 60
    aput-object v8, v10, v1

    .line 61
    .line 62
    aput-object v9, v10, v0

    .line 63
    .line 64
    sput-object v10, Lcom/moloco/sdk/internal/ortb/model/X;->g:[Lcom/moloco/sdk/internal/ortb/model/X;

    .line 65
    .line 66
    invoke-static {v10}, Lic/d;->t([Ljava/lang/Enum;)Lmf/b;

    .line 67
    .line 68
    .line 69
    new-instance v0, Lcom/moloco/sdk/internal/ortb/model/u$a;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->Companion:Lcom/moloco/sdk/internal/ortb/model/u$a;

    .line 75
    .line 76
    sget-object v0, Lef/j;->b:Lef/j;

    .line 77
    .line 78
    new-instance v1, LCd/u;

    .line 79
    .line 80
    const/16 v2, 0x12

    .line 81
    .line 82
    invoke-direct {v1, v2}, LCd/u;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v1}, LFe/c;->y(Lef/j;Ltf/a;)Lef/i;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sput-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->a:Ljava/lang/Object;

    .line 90
    .line 91
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/moloco/sdk/internal/ortb/model/X;
    .locals 1

    .line 1
    const-class v0, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/moloco/sdk/internal/ortb/model/X;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/moloco/sdk/internal/ortb/model/X;
    .locals 1

    .line 1
    sget-object v0, Lcom/moloco/sdk/internal/ortb/model/X;->g:[Lcom/moloco/sdk/internal/ortb/model/X;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/moloco/sdk/internal/ortb/model/X;

    .line 8
    .line 9
    return-object v0
.end method
