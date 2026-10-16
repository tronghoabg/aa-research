.class public final LG5/q;
.super Ljava/lang/Exception;
.source "SourceFile"


# instance fields
.field public final a:LE5/T;


# direct methods
.method public constructor <init>(LG5/l;LE5/T;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 2
    iput-object p2, p0, LG5/q;->a:LE5/T;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LE5/T;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 4
    iput-object p2, p0, LG5/q;->a:LE5/T;

    return-void
.end method
