.class public final LQe/c;
.super LHe/a;
.source "SourceFile"


# static fields
.field public static final a:LQe/c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LQe/c;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LQe/c;->a:LQe/c;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(LHe/b;)V
    .locals 1

    .line 1
    sget-object v0, LMe/b;->a:LMe/b;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LHe/b;->a(LJe/b;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, LHe/b;->onComplete()V

    .line 7
    .line 8
    .line 9
    return-void
.end method
