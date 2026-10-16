.class public final LW1/h;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:LN1/n;


# direct methods
.method public constructor <init>(LO1/c;LN1/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, LW1/h;->a:LN1/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LN1/n;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, LW1/h;->a:LN1/n;

    return-void
.end method
