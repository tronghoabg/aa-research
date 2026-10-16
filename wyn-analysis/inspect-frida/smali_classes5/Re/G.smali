.class public final enum LRe/G;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements LLe/b;


# static fields
.field public static final enum a:LRe/G;

.field public static final synthetic b:[LRe/G;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    new-instance v1, LRe/G;

    .line 3
    .line 4
    const-string v2, "INSTANCE"

    .line 5
    .line 6
    invoke-direct {v1, v2, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v1, LRe/G;->a:LRe/G;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v2, v2, [LRe/G;

    .line 13
    .line 14
    aput-object v1, v2, v0

    .line 15
    .line 16
    sput-object v2, LRe/G;->b:[LRe/G;

    .line 17
    .line 18
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)LRe/G;
    .locals 1

    .line 1
    const-class v0, LRe/G;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LRe/G;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LRe/G;
    .locals 1

    .line 1
    sget-object v0, LRe/G;->b:[LRe/G;

    .line 2
    .line 3
    invoke-virtual {v0}, [LRe/G;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LRe/G;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Lug/b;

    .line 2
    .line 3
    const-wide v0, 0x7fffffffffffffffL

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    invoke-interface {p1, v0, v1}, Lug/b;->request(J)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
