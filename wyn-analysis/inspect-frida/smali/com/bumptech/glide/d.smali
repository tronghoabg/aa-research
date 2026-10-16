.class public final enum Lcom/bumptech/glide/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:Lcom/bumptech/glide/d;

.field public static final enum b:Lcom/bumptech/glide/d;

.field public static final synthetic c:[Lcom/bumptech/glide/d;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    new-instance v4, Lcom/bumptech/glide/d;

    .line 6
    .line 7
    const-string v5, "IMMEDIATE"

    .line 8
    .line 9
    invoke-direct {v4, v5, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    new-instance v5, Lcom/bumptech/glide/d;

    .line 13
    .line 14
    const-string v6, "HIGH"

    .line 15
    .line 16
    invoke-direct {v5, v6, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v6, Lcom/bumptech/glide/d;

    .line 20
    .line 21
    const-string v7, "NORMAL"

    .line 22
    .line 23
    invoke-direct {v6, v7, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    sput-object v6, Lcom/bumptech/glide/d;->a:Lcom/bumptech/glide/d;

    .line 27
    .line 28
    new-instance v7, Lcom/bumptech/glide/d;

    .line 29
    .line 30
    const-string v8, "LOW"

    .line 31
    .line 32
    invoke-direct {v7, v8, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v7, Lcom/bumptech/glide/d;->b:Lcom/bumptech/glide/d;

    .line 36
    .line 37
    const/4 v8, 0x4

    .line 38
    new-array v8, v8, [Lcom/bumptech/glide/d;

    .line 39
    .line 40
    aput-object v4, v8, v3

    .line 41
    .line 42
    aput-object v5, v8, v2

    .line 43
    .line 44
    aput-object v6, v8, v1

    .line 45
    .line 46
    aput-object v7, v8, v0

    .line 47
    .line 48
    sput-object v8, Lcom/bumptech/glide/d;->c:[Lcom/bumptech/glide/d;

    .line 49
    .line 50
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/bumptech/glide/d;
    .locals 1

    .line 1
    const-class v0, Lcom/bumptech/glide/d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/bumptech/glide/d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/bumptech/glide/d;
    .locals 1

    .line 1
    sget-object v0, Lcom/bumptech/glide/d;->c:[Lcom/bumptech/glide/d;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lcom/bumptech/glide/d;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/bumptech/glide/d;

    .line 8
    .line 9
    return-object v0
.end method
