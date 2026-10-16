.class public final LSe/e;
.super LHe/g;
.source "SourceFile"

# interfaces
.implements LOe/f;


# static fields
.field public static final a:LSe/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LSe/e;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LSe/e;->a:LSe/e;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(LHe/h;)V
    .locals 1

    .line 1
    sget-object v0, LMe/b;->a:LMe/b;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LHe/h;->a(LJe/b;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LHe/h;->onComplete()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method
