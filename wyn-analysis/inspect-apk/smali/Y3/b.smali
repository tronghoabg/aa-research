.class public final LY3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr0/n;


# static fields
.field public static final a:LY3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY3/b;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY3/b;->a:LY3/b;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lt0/r;LP/a;J)LD0/b;
    .locals 0

    .line 1
    invoke-static {p3, p4}, LL0/a;->g(J)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p3, p4}, LL0/a;->f(J)I

    .line 6
    .line 7
    .line 8
    move-result p3

    .line 9
    sget-object p4, LY3/a;->j:LY3/a;

    .line 10
    .line 11
    invoke-static {p1, p2, p3, p4}, Lpd/f;->j(Lt0/r;IILtf/l;)LD0/b;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
