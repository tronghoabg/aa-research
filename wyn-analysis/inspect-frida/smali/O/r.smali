.class public final LO/r;
.super LO/A;
.source "SourceFile"


# static fields
.field public static final c:LO/r;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LO/r;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, LO/A;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LO/r;->c:LO/r;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(LG4/f;LE9/c;LN/y0;Lq/s1;)V
    .locals 0

    .line 1
    invoke-static {p3, p4}, LN/d;->J(LN/y0;Lq/s1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
