FROM opensearchproject/opensearch:2.18.0

RUN bin/opensearch-plugin install analysis-nori
RUN bin/opensearch-plugin install analysis-icu
